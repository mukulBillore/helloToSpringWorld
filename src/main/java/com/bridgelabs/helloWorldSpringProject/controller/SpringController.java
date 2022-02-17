package com.bridgelabs.helloWorldSpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabs.helloWorldSpringProject.model.User;

@RestController
public class SpringController {

	@GetMapping("/")
	public String sayHello() {
		return "hello from bridgelabs";
	}

	

}
