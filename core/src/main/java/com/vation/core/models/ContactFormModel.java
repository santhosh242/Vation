package com.vation.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;


@Model(adaptables = {SlingHttpServletRequest.class }, adapters = ContactFormModel.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ContactFormModel {

    @ValueMapValue
    private String name;

    @ValueMapValue
    private String email;

    @ValueMapValue
    private String subject;

    @ValueMapValue
    private String message;

    @ValueMapValue
    private String sendmessage;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public String getSendMessage() {
        return sendmessage;
    }
}
