package com.managed.ui.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("managedProperties")
@PropertySource("classpath:amp-ui-views.properties")
public class ManagedProperties 
{
	@Value("${amp.amazon.ws.url}")
	public String amazonWSURL;

	public String getAmazonWSURL() {
		return amazonWSURL;
	}

	public void setAmazonWSURL(String amazonWSURL) {
		this.amazonWSURL = amazonWSURL;
	}
	
}