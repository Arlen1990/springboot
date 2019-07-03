package com.spider.repository;

import java.util.List;

import com.spider.entity.User;

public interface UserMapper {
	List<User> selectAll();
	void save(User user);
	void update(User user);
	void deleteById(String id);
}
