package com.bridgelabs.helloWorldSpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabs.helloWorldSpringProject.model.User;

@RestController
public class SpringController {
	
@GetMapping("/homePage")
public String sayHello() {
	System.out.println("This is the console output for homePage");
	return "hello Spring";
}
@GetMapping("/")
public String homePage() {
	return "This is the home page of site";
}

@GetMapping("/User")
public User userRegistration(User user) {
 return user;	
}
}