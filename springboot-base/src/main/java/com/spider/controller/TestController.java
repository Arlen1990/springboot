package com.spider.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spider.Entity.User;

@Controller
public class TestController {
	
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

}
