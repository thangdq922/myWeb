package com.myWeb.service;

import com.myWeb.model.UserModel;

public interface IUserService {
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
