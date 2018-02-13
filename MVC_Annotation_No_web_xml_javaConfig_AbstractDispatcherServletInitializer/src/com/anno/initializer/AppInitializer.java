package com.anno.initializer;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import com.anno.config.RootConfig;
import com.anno.config.Webconfig;

public class AppInitializer extends AbstractDispatcherServletInitializer{

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext webcontext=null;
		webcontext=new AnnotationConfigWebApplicationContext();
		webcontext.register(Webconfig.class);
		return webcontext;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[]{"*.htm"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		AnnotationConfigWebApplicationContext rootContext=null;
		rootContext=new AnnotationConfigWebApplicationContext();
		rootContext.register(RootConfig.class);
		// TODO Auto-generated method stub
		return rootContext;
	}

}
