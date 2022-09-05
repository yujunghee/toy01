package com.example.toyproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.toyproject.entity.UserVo;
import com.example.toyproject.service.HelloWorldService;

@RestController
public class HelloWorldController {

	@Autowired
	private HelloWorldService service;
	
	@RequestMapping("/")
	public String hello() {
		return "Hello, World!";
	}
	
//	@RequestMapping(value="/user")
//	public List<UserVo> selectUser(){
//		
//		return service.selectUser();
//	}
	
	@RequestMapping(value="/user")
	public String selectUser(Model model){
		List<UserVo> user = service.selectUser();
		model.addAttribute("user",user);
		return "index";
	}
}
