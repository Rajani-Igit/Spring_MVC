package com.anno.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext ServletContext) throws ServletException {
		XmlWebApplicationContext rootContext=null;
		XmlWebApplicationContext webcontext=null;
		ContextLoaderListener listener=null;
		DispatcherServlet servlet=null;
		//Initializing root context for busineess components
		rootContext=new XmlWebApplicationContext();
		rootContext.setConfigLocation("/WEB-INF/web-beans-servlert.xml");
		listener=new ContextLoaderListener(rootContext);
		ServletContext.addListener(listener);
		//Initializing webcontext for Presentation tier components
		webcontext=new XmlWebApplicationContext();
		webcontext.setConfigLocation("/WEB-INF/application-context.xml");
		servlet=new DispatcherServlet(webcontext);
		//Dynamic is the innerinterface inside ServletRegstration
		ServletRegistration.Dynamic dynimc=ServletContext.addServlet("dispatcher", servlet);
		dynimc.addMapping("*.htm");
		dynimc.setLoadOnStartup(2);
		
	}

}
