package com.vation.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;



@Model(adaptables = {
     Resource.class }, adapters = NavMultiField.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL

)
public class NavMultiField {
    @ValueMapValue
    private String linktitle;

    @ValueMapValue
    private String url;

    public String getUrl() {
        return url;
    }

    public String getLinktitle() {
        return linktitle;
    }


}
