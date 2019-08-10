package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
 
	@RequestMapping(value="heathcheck",method = RequestMethod.GET)
	public String getHealthCheck() {
		return "Test App Works again";
	}

}
