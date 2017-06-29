package com.echo.dataprovider.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.echo.dataprovider.config.domain.DomainConfiguration;
import com.echo.dataprovider.config.interfaces.rest.RestConfiguration;
import com.echo.dataprovider.config.service.ServiceConfiguration;

@Configuration
@Import({DomainConfiguration.class,
		ServiceConfiguration.class, 
		RestConfiguration.class,
		DemoDataConfiguration.class})
@EnableAutoConfiguration
@EnableConfigurationProperties
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
