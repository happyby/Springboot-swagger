package com.example.swagger.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.swagger.pojo.User;

@Mapper
public interface UserMapper {

	User getUser(String name);

	List<User> getUserList();

	User getUserByNameAndPwd(String name, String pwd);

}
