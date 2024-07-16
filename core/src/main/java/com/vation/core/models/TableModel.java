package com.vation.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Model(adaptables = {SlingHttpServletRequest.class }, adapters = TableModel.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TableModel {

    @Inject
    private Resource resource;

    @Inject
    private ResourceResolver resourceResolver;

    private Iterable<Resource> formDataNodes;

    @PostConstruct
    protected void init() {
        formDataNodes = retrieveFormDataNodes();
    }

    private Iterable<Resource> retrieveFormDataNodes() {
        ResourceResolver resolver = null;
        try {
            Resource resource = resourceResolver.getResource("/content/formData");
            if (resource != null) {
                return resource.getChildren();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Iterable<Resource> getFormDataNodes() {
        return formDataNodes;
    }
}
