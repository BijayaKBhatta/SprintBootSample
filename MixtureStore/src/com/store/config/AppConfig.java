package com.store.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext context) throws ServletException {
		XmlWebApplicationContext appContainer = new XmlWebApplicationContext();
		appContainer.setConfigLocation("WEB-INF/application-context.xml");
		ContextLoaderListener listener = new ContextLoaderListener(appContainer);
		context.addListener(listener);
		XmlWebApplicationContext webContainer = new XmlWebApplicationContext();
		webContainer.setConfigLocation("WEB-INF/dispatcher-servlet.xml");
		DispatcherServlet dispatcherServlet = new DispatcherServlet(
				webContainer);
		ServletRegistration.Dynamic dynamic = context.addServlet("dispatcher",
				dispatcherServlet);
		dynamic.addMapping("*.htm");

	}

}
