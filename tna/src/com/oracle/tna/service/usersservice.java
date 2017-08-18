package com.oracle.tna.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.tna.domain.Item;
import com.oracle.tna.domain.User;
import com.oracle.tna.user.dao.itemmapper;
import com.oracle.tna.user.dao.usermapper;

import mybatis.MybatisUtil;

public class usersservice {

	private static usersservice us = new usersservice();
	public User user;
	public usersservice() {
		super();
	}
	public usersservice(User user) {
		super();
		this.user = user;
	}
	public static usersservice getUs() {
		return us;
	}
	public static void setUs(usersservice us) {
		usersservice.us = us;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsers(){
		SqlSession  sqlsession = MybatisUtil.getSqlSession(true);
		usermapper usm = sqlsession.getMapper(usermapper.class);
		List<User> users = usm.select();
		return users;
	}
	
}
