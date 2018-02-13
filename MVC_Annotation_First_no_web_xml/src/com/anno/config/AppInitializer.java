package com.anno.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext context) throws ServletException {
		// TODO Auto-generated method stub
		XmlWebApplicationContext webappContext=new XmlWebApplicationContext();
		webappContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		DispatcherServlet servlet=new DispatcherServlet(webappContext);
	   Dynamic dynamic=context.addServlet("dispatcher", servlet);
	   dynamic.addMapping("*.htm");
	   dynamic.setLoadOnStartup(1);
	}

}
