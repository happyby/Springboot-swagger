package com.example.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.swagger.pojo.User;
import com.example.swagger.service.UserService;
import com.example.swagger.utils.JsonUtil;
@Api
@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	
	 @RequestMapping(value = "/getUserByName/{name}", method =RequestMethod.GET,produces = "application/json")
	 @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String", paramType = "path")
	 @ApiOperation(value="获取用户",notes="通过用户名获取用户")
	public String getUser(
			@PathVariable(value = "name" ,required=true)  String name
			){
		 try{
			 User user=userService.getUser(name);
			 
			 return JsonUtil.object2JsonStr(user);
		 }catch(Exception e){
			 return "failed";
		 }
	}
	
	 @RequestMapping(value = "/getUsers", method =RequestMethod.GET,produces = "application/json")
	 @ApiOperation(value="获取用户列表",notes="获取所有用户")
	 public String userList(){
		 try{
		List<User> list=userService.getUserList();
			 
			 return JsonUtil.object2JsonStr(list);
		 }catch(Exception e){
			 return "failed";
		 }
	 }
	 @ApiOperation(value="获取用户", notes="通过用户名和密码获取用户", httpMethod="POST")
	 @RequestMapping(value = "/getUserByNameAndpwd", method =RequestMethod.POST,produces = "application/json")
	 public String getUserByNameAndpwd(
			 @ApiParam("用户名，必选")@RequestParam(value = "name",required = true )
				String name,
				@ApiParam("密码，必选")@RequestParam( value = "pwd",required = true)
				String pwd,
				HttpServletResponse response
			 ){
		 try{
			 User user=userService.getUserByNameAndPwd(name,pwd);
			 return JsonUtil.object2JsonStr(user);
		 }catch(Exception e){
			 response.setStatus(HttpStatus.SC_NOT_FOUND);
			 return "failed";
		 } 
	 }
	
}
