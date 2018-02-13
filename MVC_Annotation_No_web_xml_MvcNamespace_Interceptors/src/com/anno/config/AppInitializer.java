package com.anno.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class AppInitializer extends AbstractDispatcherServletInitializer{

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		// TODO Auto-generated method stub
		XmlWebApplicationContext webcontext=null;
		webcontext=new XmlWebApplicationContext();
		webcontext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		return webcontext;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[]{"*.htm"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		XmlWebApplicationContext rootcontext=null;
		rootcontext=new XmlWebApplicationContext();
		rootcontext.setConfigLocation("/WEB-INF/application-context.xml");
		// TODO Auto-generated method stub
		return null;
	}

}
