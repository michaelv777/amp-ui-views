package com.managed.ui.appl;

import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Michael Veksler
 */

@ComponentScan(basePackages = 
		{"com.managed.ui",
		"com.amp.business",
		"com.amp.data.handler",
		"com.amp.common.api"})

@SpringBootApplication(scanBasePackages = 
		{ "com.managed.ui",
		  "com.amp.business",
		  "com.amp.data.handler",
		  "com.amp.common.api"})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args)
    {
    	Properties prop = new Properties();
    	SpringApplicationBuilder appBuilder = 
    			new SpringApplicationBuilder(Application.class);
    	appBuilder.properties(prop);
    	appBuilder.run(args);
    	
    
    	/*
        SpringApplication.run(MonitorApplication.class, args);
        */
    }
    
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
    	//servletContext.setInitParameter("joinfaces.jsf.state_saving_method", "client");
    	//servletContext.setInitParameter("joinfaces.jsf.project-stage", "Development");
    	//servletContext.setInitParameter("joinfaces.primefaces.uploader", "auto");
    	
        super.onStartup(servletContext);
    }
    
   
}
