package com.vation.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = {SlingHttpServletRequest.class }, adapters = FooterModel.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterModel  {
	@ValueMapValue
	private String title;

	@ValueMapValue
	private String mobilenumber;

	@ValueMapValue
	private String email;

	@ValueMapValue
	private String address;


	@ChildResource
	@Via("resource")
	private List<NavMultiField> quicklinks;

	@ChildResource
	@Via("resource")
	private List<NavMultiField> popularlinks;

	public String getTitle() {
		return title;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}


	public List<NavMultiField> getQuicklinks() {
		return quicklinks;
	}
	public List<NavMultiField> getPopularlinks() {
		return popularlinks;
	}



}
