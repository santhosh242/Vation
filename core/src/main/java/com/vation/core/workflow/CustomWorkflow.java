package com.vation.core.workflow;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
import com.day.cq.commons.jcr.JcrConstants;
import org.apache.sling.api.resource.*;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


import java.util.HashMap;
import java.util.Map;

@Component(service = WorkflowProcess.class,
        property = {"process.label=Custom Workflow Process" })
public class CustomWorkflow implements WorkflowProcess {

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

            Resource pageResource = resourceResolver.getResource(pagePath + "/" + JcrConstants.JCR_CONTENT);
            if (pageResource != null) {

                ModifiableValueMap properties = pageResource.adaptTo(ModifiableValueMap.class);
                if (properties != null) {

                    properties.put("customProperty", "customValue");


                    resourceResolver.commit();
                }
            }
        } catch (PersistenceException e) {
            throw new WorkflowException("Failed to persist property on page path", e);
        } catch (LoginException e) {
            throw new RuntimeException(e);
        } finally {
            if (resourceResolver != null && resourceResolver.isLive()) {
                resourceResolver.close();
            }
        }
    }
}