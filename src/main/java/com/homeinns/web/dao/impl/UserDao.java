package com.homeinns.web.dao.impl;

import com.homeinns.web.dao.IUserDao;

public class UserDao implements IUserDao {

	@Override
	public String sayName(String name) {
		return "hi : " + name;
	}
}
