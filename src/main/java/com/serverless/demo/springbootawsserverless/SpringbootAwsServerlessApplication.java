package com.serverless.demo.springbootawsserverless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.serverless.demo.controllers.UniqueIdController;

@SpringBootApplication
@Import({ com.serverless.demo.controllers.UniqueIdController.class })
public class SpringbootAwsServerlessApplication extends SpringBootServletInitializer{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringbootAwsServerlessApplication.class, args);		
	}
	

}
