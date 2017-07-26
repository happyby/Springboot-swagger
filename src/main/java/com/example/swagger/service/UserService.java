package com.example.swagger.service;

import java.util.List;

import com.example.swagger.pojo.User;

public interface UserService {

	User getUser(String name);

	List<User> getUserList();

	User getUserByNameAndPwd(String name, String pwd);

}
