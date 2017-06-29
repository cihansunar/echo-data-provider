package com.echo.dataprovider.config.service.greeting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.echo.dataprovider.services.greeting.GreetingService;

@Configuration
public class GreetingServiceConfiguration {
	
	@Bean 
	public GreetingService greetingService(){
		return new GreetingService();
	}
}