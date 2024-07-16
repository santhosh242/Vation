package com.vation.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = {SlingHttpServletRequest.class }, adapters = HeaderNavigationModel.class,
                 defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderNavigationModel  {
    @ValueMapValue
    private String title;

    @ValueMapValue
    private String mobilenumber;

    @ValueMapValue
    private String email;

    @ValueMapValue
    private String buttontext;

    @ValueMapValue
    private String buttonurl;


    @ChildResource
    @Via("resource")
    private List<NavMultiField> cards;

    public String getTitle() {
        return title;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public String getEmail() {
        return email;
    }

    public List<NavMultiField> getCards() {
        return cards;
    }

    public String getButtontext() {
        return buttontext;
    }

    public String getButtonurl() {
        return buttonurl;
    }

}
