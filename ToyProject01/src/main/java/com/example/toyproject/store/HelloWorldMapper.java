package com.example.toyproject.store;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.toyproject.entity.UserVo;

@Repository
@Mapper
public interface HelloWorldMapper {
	public List<UserVo> selectUser();
}
