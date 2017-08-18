package com.oracle.tna.service;

import org.apache.ibatis.session.SqlSession;

import com.oracle.tna.domain.User;
import com.oracle.tna.user.dao.usermapper;

import mybatis.MybatisUtil;

public class personalinfoservice {

	public static personalinfoservice perinfos = new personalinfoservice(); 
	public User user;
	public personalinfoservice(User user) {
		super();
		this.user = user;
	}
	public personalinfoservice() {
		super();
	}
	public static personalinfoservice getPerinfos() {
		return perinfos;
	}
	public static void setPerinfos(personalinfoservice perinfos) {
		personalinfoservice.perinfos = perinfos;
	}
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void updateUser(User user) {
		System.out.println("username:"+user.getUsername()+" password:"+user.getPassword()+" name:"+user.getName());
		SqlSession sqlsession = MybatisUtil.getSqlSession(true);
		usermapper usm = sqlsession.getMapper(usermapper.class);
		System.out.println("come here");
		usm.update(user);
		System.out.println("update success.");
		sqlsession.commit();
	}
}
