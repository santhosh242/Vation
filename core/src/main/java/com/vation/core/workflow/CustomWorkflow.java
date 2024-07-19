package com.vation.core.workflow;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
import com.day.crx.JcrConstants;
import org.apache.sling.api.resource.*;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component(
        service = WorkflowProcess.class,
        property = {
                "process.label=Custom Workflow Process",
                "process.description=A custom workflow process to set custom properties on pages."
        }
)
public class CustomWorkflow implements WorkflowProcess {

    private static final Logger LOG = LoggerFactory.getLogger(CustomWorkflow.class);

    @Reference
    private ResourceResolverFactory resolverFactory;

    @Override
    public void execute(WorkItem workItem, WorkflowSession wfSession, MetaDataMap metaDataMap)
            throws WorkflowException {
        ResourceResolver resourceResolver = null;
        try {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put(ResourceResolverFactory.SUBSERVICE, "workflow-service");
            resourceResolver = resolverFactory.getServiceResourceResolver(paramMap);

            String pagePath = workItem.getWorkflowData().getPayload().toString();
            String contentPath = pagePath + "/" + JcrConstants.JCR_CONTENT;

            Resource pageResource = resourceResolver.getResource(contentPath);

            if (pageResource != null) {
                String templatePath = pageResource.getValueMap().get("cq:template", String.class);

                if (Objects.equals(templatePath, "/conf/vation/settings/wcm/templates/gymster")) {
                    updateExpireDate(pageResource, -10);
                } else if (Objects.equals(templatePath, "/conf/vation/settings/wcm/templates/page-content")) {
                    updateExpireDate(pageResource, +10);
                } else {
                    LOG.warn("No actions defined for template path: {}", templatePath);
                }
            } else {
                LOG.warn("Page resource not found at path: {}", contentPath);
            }
        } catch (LoginException e) {
            throw new WorkflowException("Login exception while executing workflow", e);
        } catch (PersistenceException e) {
            throw new WorkflowException("Failed to persist property on page path", e);
        } finally {
            if (resourceResolver != null && resourceResolver.isLive()) {
                resourceResolver.close();
            }
        }
    }

    private void updateExpireDate(Resource pageResource, int daysToAdd) throws PersistenceException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        ModifiableValueMap properties = pageResource.adaptTo(ModifiableValueMap.class);
        if (properties != null) {
            calendar.add(Calendar.DAY_OF_MONTH, daysToAdd);
            Date expireDate = calendar.getTime();
            String formattedExpireDate = dateFormat.format(expireDate);
            properties.put("Expire Date", formattedExpireDate);
            pageResource.getResourceResolver().commit();
            LOG.info("Updated Expire Date property for page: {}", pageResource.getPath());
        } else {
            LOG.warn("Failed to adapt pageResource to ModifiableValueMap: {}", pageResource.getPath());
        }
    }
}
