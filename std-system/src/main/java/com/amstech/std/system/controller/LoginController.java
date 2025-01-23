package com.amstech.std.system.controller;

import com.amstech.std.system.service.UserService;

public class LoginController {
	private UserService userService;
	
	public LoginController(UserService userService) {
		this.userService=userService;
				
	}
	private void init() {
		System.out.println("LoginController: init method");
		login();
	}
	public void login() {
		userService.login();
	}

}
