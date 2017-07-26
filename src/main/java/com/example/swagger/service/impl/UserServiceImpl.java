package com.example.swagger.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.swagger.mapper.UserMapper;
import com.example.swagger.pojo.User;
import com.example.swagger.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	@Override
	public User getUser(String name) {
		return userMapper.getUser(name);
	}

	@Override
	public List<User> getUserList() {
		
		return userMapper.getUserList();
	}

	@Override
	public User getUserByNameAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub
		return userMapper.getUserByNameAndPwd(name,pwd);
	}

}
