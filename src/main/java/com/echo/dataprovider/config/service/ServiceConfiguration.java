package com.echo.dataprovider.config.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.echo.dataprovider.config.service.greeting.GreetingServiceConfiguration;


@Configuration
@Import ({GreetingServiceConfiguration.class})
public class ServiceConfiguration {
	
	
}