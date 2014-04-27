package com.homeinns.web.service.impl;

import com.homeinns.web.dao.IUserDao;
import com.homeinns.web.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDao userDao;
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public String sayName(String name) {
		return userDao.sayName(name);
	}
}
