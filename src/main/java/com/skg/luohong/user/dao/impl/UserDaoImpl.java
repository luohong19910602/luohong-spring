package com.skg.luohong.user.dao.impl;

import com.skg.luohong.user.dao.IUserDao;
import com.skg.luohong.user.entity.User;

public class UserDaoImpl implements IUserDao {

	public void add(User user) {
		System.out.println("add user");
	}

	public void delete(User user) {
		System.out.println("delete user");
	}
	
}
