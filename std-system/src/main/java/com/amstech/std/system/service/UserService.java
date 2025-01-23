package com.amstech.std.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.amstech.std.system.repo.UserRepo;

public class UserService {

 @Value("${app.file-path}") 
	private String filePath;

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Autowired
	@Qualifier("userRepoDB2Impl")
	private UserRepo userRepo;

	public UserService() {
		System.out.println("UserService: Object Created");
	}

	public void save() {
		System.out.println("saving user...");
		System.out.println("saving user... On Filepath:" + filePath);
		long count = userRepo.save();
	}

	public void update() {
		System.out.println("updating user...");
	}

	public void login() {
		System.out.println("login user...");
	}
}
