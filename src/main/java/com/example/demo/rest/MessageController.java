package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.AppConstants;
import com.example.demo.props.AppProperties;

@RestController
public class MessageController {
	
	@Autowired
	private AppProperties appProps;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return appProps.getMessages().get(AppConstants.WELCOME_MSG_KEY);
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		return appProps.getMessages().get(AppConstants.GREET_MSG_KEY);
	}

}
