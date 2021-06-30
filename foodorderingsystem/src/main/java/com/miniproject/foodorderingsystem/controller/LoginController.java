package com.miniproject.foodorderingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.foodorderingsystem.model.User;
import com.miniproject.foodorderingsystem.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginservice;

// to register new user or add new users details to database
	@PostMapping(path = "/add")
	public User addUser(@RequestBody User user) {
		System.out.println("Working...");
		User Users = loginservice.save(user);
		return Users;
	}
	// to verify the login user

}
