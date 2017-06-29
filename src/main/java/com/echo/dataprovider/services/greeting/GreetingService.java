package com.echo.dataprovider.services.greeting;

import java.util.concurrent.atomic.AtomicLong;

import com.echo.common.domain.model.greeting.Greeting;


public class GreetingService {
	
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
	public  Greeting getGreet(String name){
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
	}
}