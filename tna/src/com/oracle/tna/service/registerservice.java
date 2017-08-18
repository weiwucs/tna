package com.oracle.tna.service;

import org.apache.ibatis.session.SqlSession;

import com.oracle.tna.domain.User;
import com.oracle.tna.user.dao.usermapper;

import mybatis.MybatisUtil;

public class registerservice {

	public static registerservice regs = new registerservice();
	public User user;
	
	public registerservice() {
		super();
	}

	public registerservice(User user) {
		super();
		this.user = user;
	}

	public  static registerservice getRegs() {
		return regs;
	}

	public static void setRegs(registerservice regs) {
		registerservice.regs = regs;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
		SqlSession sqlsession = MybatisUtil.getSqlSession(true);
		usermapper usm = sqlsession.getMapper(usermapper.class);
		usm.insert(user);
		sqlsession.commit();
	}
}
