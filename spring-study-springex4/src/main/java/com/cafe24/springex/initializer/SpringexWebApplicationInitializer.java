package com.cafe24.springex.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.cafe24.springex.config.WebConfig;

public class SpringexWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * RootContext
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	/**
	 * WebContext
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	/**
	 * 디스패처 서블릿 매핑을 어떻게 할 것인가?
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
