package com.anno.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration

public class Webconfig {
@Bean
	public SimpleUrlHandlerMapping simpleurlHandlerMapping(){
		SimpleUrlHandlerMapping mapping=new SimpleUrlHandlerMapping();
		Properties props=new Properties();
		props.put("/home.htm","pvc");
		mapping.setMappings(props);
		return mapping;
		
		
	}
	@Bean(name="pvc")
	public ParameterizableViewController parameterizableViewController(){
		ParameterizableViewController pvc=new ParameterizableViewController();
		pvc.setViewName("home");
		return pvc;
		
	}
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver viewresolver =new InternalResourceViewResolver();
		viewresolver.setPrefix("/WEB-INF/views/");
		viewresolver.setSuffix(".jsp");
		return viewresolver;
	}
	
	
}
