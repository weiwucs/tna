package com.oracle.tna.service;

import org.apache.ibatis.session.SqlSession;

import com.oracle.tna.domain.User;
import com.oracle.tna.user.dao.usermapper;

import mybatis.MybatisUtil;

public class loginservice {
	
	public static loginservice logs = new loginservice();
	public User user;
	
	public loginservice(){
		super();
	}

	public loginservice(User user) {
		super();
		this.user = user;
	}

	public static loginservice getLogs() {
		return logs;
	}

	public static void setLogs(loginservice logs) {
		loginservice.logs = logs;
	}

	public User getUser(String username) {
		SqlSession  sqlsession = MybatisUtil.getSqlSession(true);
		usermapper usm = sqlsession.getMapper(usermapper.class);
		user = usm.selectByusername(username);
		System.out.println("username:"+user.getUsername()+" password:"+user.getPassword());
		return user;
	}
	
}
