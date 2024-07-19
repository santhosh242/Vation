package com.vation.core.listeners;

import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.resource.observation.ResourceChange;
import org.apache.sling.api.resource.observation.ResourceChangeListener;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.workflow.WorkflowService;
import com.day.cq.workflow.WorkflowSession;
import com.day.cq.workflow.exec.WorkflowData;
import com.day.cq.workflow.model.WorkflowModel;

import javax.jcr.Session;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Component(
        immediate = true,
        service = ResourceChangeListener.class,
        property = {
                ResourceChangeListener.PATHS + "=/content/vation/us/en",
                ResourceChangeListener.CHANGES + "=ADDED"
        }
)
public class CustomEventListener implements ResourceChangeListener {

    private static final Logger log = LoggerFactory.getLogger(CustomEventListener.class);

    @Reference
    private ResourceResolverFactory resourceResolverFactory;

    @Reference
    private WorkflowService workflowService;

    @Override
    public void onChange(List<ResourceChange> changes) {
        for (ResourceChange change : changes) {
            String path = change.getPath();
            if (path.startsWith("/content/vation/us/en")) {
                startWorkflow(path);
            }
        }
    }

    private void startWorkflow(String payloadPath) {
        ResourceResolver resolver = null;
        try {
            Map<String, Object> param = Collections.singletonMap(ResourceResolverFactory.SUBSERVICE, "workflow-service");
            resolver = resourceResolverFactory.getServiceResourceResolver(param);
            WorkflowSession workflowSession = workflowService.getWorkflowSession(resolver.adaptTo(Session.class));
            WorkflowModel workflowModel = workflowSession.getModel("/var/workflow/models/custom-workflow");
            WorkflowData workflowData = workflowSession.newWorkflowData("JCR_PATH", payloadPath);
            workflowSession.startWorkflow(workflowModel, workflowData);
            log.info("Workflow started for path: {}", payloadPath);
        } catch (Exception e) {
            log.error("Error starting workflow for path: {}", payloadPath, e);
        } finally {
            if (resolver != null) {
                resolver.close();
            }
        }
    }
}