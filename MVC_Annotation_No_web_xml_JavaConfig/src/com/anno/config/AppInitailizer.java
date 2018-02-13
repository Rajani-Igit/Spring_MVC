package com.anno.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/*Spring provided webapplicationInitializer Interface and you need to implement
this class and you have to create application context rotcontext and webContext
either XmlWebapplicationContext or AnnotationConfigWebApplicationContext,
But here we have to do everything creating the context,Creating the dispatcherServlet, ContextLoaderListener  and then we need to registering 
the application context to filter and dispatcherServlet, Which is boilerplate logic.
So Spring provided two Abstract classes (AbstractDispatcherServletInitializer for working with xml files and  AbstractAnnotationConfigDispatcherServletInitializer  to work with javaconfiguration classes) to overcome this one, 
*
*/
public class AppInitailizer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletcontext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext rotcontext=null;
		AnnotationConfigWebApplicationContext webContext=null;
		DispatcherServlet servlet=null;
		ContextLoaderListener listener=null;
		DispatcherServlet dispatcher=null;
		
		rotcontext=new AnnotationConfigWebApplicationContext();
		rotcontext.register(AppConfig.class);
		listener=new ContextLoaderListener(rotcontext);
		servletcontext.addListener(listener);
		
		webContext=new AnnotationConfigWebApplicationContext();
		webContext.register(Webconfig.class);
		dispatcher=new DispatcherServlet(webContext);
		Dynamic dynamic=servletcontext.addServlet("dispatcher", dispatcher);
		dynamic.addMapping("*.htm");
		dynamic.setLoadOnStartup(2);
		
	}

}
