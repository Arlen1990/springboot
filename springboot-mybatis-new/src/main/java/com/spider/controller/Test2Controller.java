package com.spider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spider.Entity.User;

@RestController
public class Test2Controller {

	@RequestMapping("/test/json")
	public User getUser(){
		User user=new User();
		user.setUsername("张三");
		user.setPassword("123456");
		return user;
	}
}
