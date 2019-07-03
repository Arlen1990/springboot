package com.spider.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.spider.Entity.User;

public interface UserMapper {
	/**
	 * Results 主要用于entity与sql字段不一致情况
	 * @return
	 */
	@Select("SELECT * FROM user")
	@Results({@Result(property="username",column="username"),
		@Result(property="password",column="password")})
	List<User> getAll();
	@Insert("Insert INTO user(id,username,password) VALUES(#{id},#{username},#{password})")
	void insert(User user);
	@Update("UPDATE user SET username=#{username},password=#{password} where id=#{id}")
	void update(User user);
	@Delete("DELETE FROM user WHERE  id =#{id}")
	void delete(String id);
}
