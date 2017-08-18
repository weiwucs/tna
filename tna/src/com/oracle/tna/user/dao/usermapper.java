package com.oracle.tna.user.dao;

import java.util.List;

import com.oracle.tna.domain.User;

public interface usermapper {

	// 增
	public void insert(User user);

	// 改
	public User selectByid(int uid);
	
	public User selectByusername(String username);

	//更新
	public void update(User user);

	//选择
	public List<User> select();

	// 删
	public void delete(int uid);
}
