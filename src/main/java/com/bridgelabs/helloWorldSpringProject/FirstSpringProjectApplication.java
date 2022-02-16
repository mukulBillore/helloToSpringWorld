package com.bridgelabs.helloWorldSpringProject;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bridgelabs.helloWorldSpringProject.model.User;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		System.out.println("above SpringApplicaton.run  method");
		SpringApplication.run(FirstSpringProjectApplication.class, args);
		System.out.println("after SpringApplicaton.run  method ");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		
		/*ArrayList<User> users=new ArrayList<User>();
        for(int i=0;i<10;i++) {
        	User U = new User();
        	users.add(U.userGet());
        }
        for(int i=0;i<users.size();i++) {
        	System.out.println("first name : "+users.get(i).getFirstName());
        	System.out.println("last name  : "+users.get(i).getLastName());
        	System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        }*/
		
	}

	
}