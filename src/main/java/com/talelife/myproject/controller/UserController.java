package com.talelife.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talelife.myproject.feign.UserWebService;
import com.talelife.util.Result;

@RestController
@RequestMapping("/user_api")
public class UserController extends BaseController{
	
	@Autowired
	private UserWebService userWebService;
	
	@RequestMapping("/get_user")
	public Result getUser(Long id){
		return userWebService.getUser(id);
	}
	
	
}
