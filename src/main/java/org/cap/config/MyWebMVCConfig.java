package org.cap.config;

import java.util.ArrayList;
import java.util.List;

import org.cap.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("org.cap")
public class MyWebMVCConfig {

	@Bean
	public ViewResolver getViewResolver() {
		//
		//job of viewresolver is to resolve the page from the name of view
		//
		// /WEB-INF/pages/hellopage.jsp
		//
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	
	
}
