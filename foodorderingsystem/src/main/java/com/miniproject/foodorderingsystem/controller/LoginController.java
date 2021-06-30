package com.miniproject.foodorderingsystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@GetMapping("")
	public String homePage() {
		return "login";
	}

	@RequestMapping("/register")
	public String register() {
		return "registration";
	}

	@PostMapping("/adduser")
	public void addUser(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println(name);
		session.setAttribute("name", name);
	}

}
