package com.example.toyproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.toyproject.entity.UserVo;
import com.example.toyproject.store.HelloWorldMapper;

@Service
public class HelloWorldService {

	@Autowired
	private HelloWorldMapper mapper;
	
	public List<UserVo> selectUser(){
		return mapper.selectUser();
	}
}
