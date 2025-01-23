package com.amstech.std.system.repo.impl;

import com.amstech.std.system.repo.UserRepo;

public class UserRepoMysqlImpl implements UserRepo {
	
	public UserRepoMysqlImpl() {
		System.out.println("UserRepoMysqlImpl: object created");
	}

	@Override
	public long save() {
		// TODO Auto-generated method stub
		System.out.println("UserRepoMysqlImpl: user saving...");

		return 0;
	}

	@Override
	public long update() {
		// TODO Auto-generated method stub
		System.out.println("UserRepoMysqlImpl: user updating...");

		return 0;
	}

	@Override
	public long deleteByID(long id) {
		// TODO Auto-generated method stub
		System.out.println("UserRepoMysqlImpl:user deleted....");

		return 0;
	}

}
