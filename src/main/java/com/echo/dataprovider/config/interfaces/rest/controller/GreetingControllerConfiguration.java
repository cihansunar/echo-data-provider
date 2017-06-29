package com.echo.dataprovider.config.interfaces.rest.controller;

import org.springframework.context.annotation.Bean;

import com.echo.dataprovider.interfaces.rest.controller.greeting.GreetingController;

public class GreetingControllerConfiguration {
	
	@Bean
	GreetingController greetingController () {
		return new GreetingController();
	}
}