package com.myWeb.service.impl;

import com.myWeb.dao.IUserDAO;
import com.myWeb.dao.impl.UserDAO;
import com.myWeb.model.UserModel;
import com.myWeb.service.IUserService;

public class UserService implements IUserService {

	private IUserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}
	
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}
	
}
