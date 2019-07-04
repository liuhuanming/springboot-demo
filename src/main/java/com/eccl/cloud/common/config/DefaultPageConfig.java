package com.eccl.cloud.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class DefaultPageConfig extends WebMvcConfigurerAdapter{
	@Override
	   public void addViewControllers( ViewControllerRegistry registry ) {
	       registry.addViewController( "/" ).setViewName( "forward:/kaoshide/index1.html" );
	       registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
	       super.addViewControllers( registry );
	   }
}
