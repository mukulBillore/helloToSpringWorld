package com.bridgelabs.helloWorldSpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public String sayHelloByPathVar(@PathVariable String name ) {
	return "hello  "+name+"  from bridge labs";
	}
	@GetMapping("/param")
	public String sayHelloByParam(@RequestParam String name)
	{
		return "hello  "+name+"  from bridge labs";
	}
	@PostMapping("/user")
	public String sayHelloByParam(@RequestBody User user)
	{
		return "hello "+user.getFirstName()+" "+user.getLastName()+"from bridgelabs";
	}
}
