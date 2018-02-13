package com.anno.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.anno.controller"})
public class WebConfig extends WebMvcConfigurerAdapter{
@Override
public void configureViewResolvers(ViewResolverRegistry registry) {
	// TODO Auto-generated method stub
	registry.jsp("/WEB-INF/views/", ".jsp");
}
@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
	registry.addViewController("dashboard.htm").setViewName("dashboard");
	}
	
}
