package com.vation.core.schedulers;

import com.day.cq.replication.ReplicationActionType;
import com.day.cq.replication.ReplicationException;
import com.day.cq.replication.Replicator;
import org.apache.sling.api.resource.*;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.vation.core.config.SchedulerConfig;
import javax.jcr.Session;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component(service = Runnable.class, immediate = true)
@Designate(ocd = SchedulerConfig.class)
public class ActivateScheduler implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(ActivateScheduler.class);
    private static final String BASE_PATH = "/content/vation/us/en";

    @Reference
    private ResourceResolverFactory resolverFactory;

    @Reference
    private Replicator replicator;

    private String schedulerExpression;

    @Activate
    @Modified
    protected void activate(final SchedulerConfig config) {
        schedulerExpression = config.scheduler_expression();
        LOG.info("Gymster Scheduler started with expression: {}", config.scheduler_expression());
    }

    @Override
    public void run() {
        ResourceResolver resourceResolver = null;
        try {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put(ResourceResolverFactory.SUBSERVICE, "workflow-service");
            resourceResolver = resolverFactory.getServiceResourceResolver(paramMap);

            Resource baseResource = resourceResolver.getResource(BASE_PATH);
            if (baseResource != null) {
                iterateAndProcess(baseResource);
            } else {
                LOG.warn("Base path resource not found: {}", BASE_PATH);
            }
        } catch (LoginException e) {
            LOG.error("Login exception while executing expiry scheduler", e);
        } finally {
            if (resourceResolver != null && resourceResolver.isLive()) {
                resourceResolver.close();
            }
        }
    }

    private void iterateAndProcess(Resource resource) {
        for (Resource child : resource.getChildren()) {
            if (child.isResourceType("cq:Page")) {
                processPage(child);
            }
            iterateAndProcess(child);
        }
    }

    private void processPage(Resource pageResource) {
        Resource contentResource = pageResource.getChild("jcr:content");
        if (contentResource != null) {
            ValueMap properties = contentResource.getValueMap();
            String expireDateStr = properties.get("Expire Date", String.class);

            if (expireDateStr != null) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                try {
                    Date expireDate = dateFormat.parse(expireDateStr);
                    Date currentDate = Calendar.getInstance().getTime();
                    if (expireDate.before(currentDate)) {
                        replicator.replicate(pageResource.getResourceResolver().adaptTo(Session.class), ReplicationActionType.DEACTIVATE, pageResource.getPath());
                        LOG.info("Unpublished page: {}", pageResource.getPath());
                    } else {
                        replicator.replicate(pageResource.getResourceResolver().adaptTo(Session.class), ReplicationActionType.ACTIVATE, pageResource.getPath());
                        LOG.info("Published page: {}", pageResource.getPath());
                    }
                } catch (ParseException | ReplicationException e) {
                    LOG.error("Error processing page: {}", pageResource.getPath(), e);
                }
            }
        }
    }
}
