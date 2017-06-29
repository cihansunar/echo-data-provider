package com.echo.dataprovider.interfaces.rest.controller.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.echo.common.domain.model.greeting.Greeting;
import com.echo.dataprovider.services.greeting.GreetingService;

@RestController
public class GreetingController {

	@Autowired
	GreetingService greetingService;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	return greetingService.getGreet(name);
    }
}
