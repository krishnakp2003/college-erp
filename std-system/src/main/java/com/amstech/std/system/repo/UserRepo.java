package com.amstech.std.system.repo;

public interface UserRepo {
	public long save();
	public long update();
	public long deleteByID(long id);

}
