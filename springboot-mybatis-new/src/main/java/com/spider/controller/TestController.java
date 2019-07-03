package com.spider.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spider.Entity.User;
import com.spider.mapper.UserMapper;

@Controller
public class TestController {
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/testJsp")
	public String hello(){
		System.out.println("测试修改");
		return "test002";
	}
	
	@RequestMapping("/helloHtml")
	public String helloHtml(){
		System.out.println("测试修改2");
		return "test001";
	}
	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView m=new ModelAndView("/index");
		List<User> list=new ArrayList<User>();
		list.add(new User("张三","11111112"));
		list.add(new User("张三2","11111113"));
		list.add(new User("张三3","11111114"));
		list.add(new User("张三4","11111115"));
		m.addObject("list",list);
		return m;
	}
	@RequestMapping("/getAll")
	public String testMybatis(){
		System.out.println("进入完成");
		List<User> list=userMapper.getAll();
		System.out.println("查询完成");
		for(User user:list){
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
		}
		return "test001";
	}
	@RequestMapping("/insertUser")
	public String insertUser(){
		User user =new User();
		user.setId("5");
		user.setUsername("aaa");
		user.setPassword("aaap");
		userMapper.insert(user);
		return "test001";
	} 	
	@RequestMapping("/updateUser")
	public String updateUser(){
		User user =new User();
		user.setUsername("aaa");
		user.setPassword("aaap");
		user.setId("1");
		userMapper.update(user);
		return "test001";
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(){
		userMapper.delete("1");
		return "test001";
	}

}
