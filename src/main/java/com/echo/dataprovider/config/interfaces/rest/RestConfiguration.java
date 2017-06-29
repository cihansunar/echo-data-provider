package com.echo.dataprovider.config.interfaces.rest;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.echo.dataprovider.config.interfaces.rest.controller.GreetingControllerConfiguration;


@Configuration
@Import({GreetingControllerConfiguration.class})
public class RestConfiguration {
	
}