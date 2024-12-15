package com.gentech.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ContentController {

	@GetMapping("/home")
	public String handleHomePage()
	{
		return "Home Page has displayed Successfully";
	}

	@GetMapping("/user")
	public String handleUserHomePage()
	{
		return "The User Home Page has displayed Successfully";
	}
	
	@GetMapping("/admin")
	public String handleAdminHomePage()
	{
		return "The Admin Home Page has displayed Successfully";
	}
}