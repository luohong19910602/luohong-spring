package com.skg.luohong.user.controller;

import com.skg.luohong.user.dao.IUserDao;
import com.skg.luohong.user.entity.User;

/**
 * 测试
 * haha
 * */
public class UserController {

	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add(){
		userDao.add(new User());
	}
	
	public void delete(){
		userDao.delete(new User());
	}
	
}
