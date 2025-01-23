package com.amstech.std.system.controller;

import com.amstech.std.system.service.UserService;

public class UserController {

	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public UserController() {
		System.out.println("UserController: Object Created");

	}
	
	private void init() {
		System.out.println("UserController: Init Method");
		
		save();
		update();
	}
	

	public void save() {
		userService.save();
		

	}
	public void update() {
		
		userService.update();

	}

}
