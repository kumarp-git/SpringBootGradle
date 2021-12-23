package com.kumar.spring.boot.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;//WebMvcConfigurerAdapter

@Component
public class ProductServiceInterceptorAppConfig extends WebMvcConfigurationSupport {
	@Autowired
	ProductServiceInterceptor productServiceInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(productServiceInterceptor);
	}
}
