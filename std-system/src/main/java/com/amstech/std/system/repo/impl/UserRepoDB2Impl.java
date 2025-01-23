package com.amstech.std.system.repo.impl;

import com.amstech.std.system.repo.UserRepo;

public class UserRepoDB2Impl implements UserRepo {
	
	public UserRepoDB2Impl() {
		System.out.println("UserRepoDB2Impl: object created");
	}

	@Override
	public long save() {
		// TODO Auto-generated method stub
		System.out.println("UserRepoDB2Impl: saving user.....");
		return 0;
	}

	@Override
	public long update() {
		// TODO Auto-generated method stub
		System.out.println("UserRepoDB2Impl: updating user...");
		return 0;
	}

	@Override
	public long deleteByID(long id) {
		// TODO Auto-generated method stub
		System.out.println("UserRepoDB2Impl: deleting user...");
		return 0;
	}

}
