package com.bridgelabs.helloWorldSpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabs.helloWorldSpringProject.model.User;

@RestController
public class SpringController {

	@GetMapping("/")
	public String sayHello() {
		return "hello from bridgelabs";
	}

	@GetMapping("/query/{name}")
	public String sayHelloByParam(@PathVariable String name ) {
	return "hello  "+name+"  from bridge labs";
	}

}
