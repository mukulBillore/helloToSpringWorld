package com.bridgelabs.helloWorldSpringProject.model;

import java.util.Scanner;

public class User {
private String firstName;
private String lastName;
public User(User user) {
	
	this.firstName = user.firstName;
	this.lastName = user.lastName;
}
public User() {
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

//just to check
public User userGet() {
Scanner sc= new Scanner(System.in);	
User user1 =new User();
System.out.println("Enter user first name");
user1.setFirstName(sc.nextLine());
System.out.println("Enter user Last name");
user1.setLastName(sc.nextLine());
return user1;

}

}
