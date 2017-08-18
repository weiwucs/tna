package com.oracle.tna.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.tna.domain.Item;
import com.oracle.tna.user.dao.itemmapper;
import com.oracle.tna.user.dao.usermapper;

import mybatis.MybatisUtil;

public class examservice {
	private static examservice exs = new examservice();
	public Item item;
	public examservice(Item item) {
		super();
		this.item = item;
	}
	public examservice() {
		super();
	}
	public static examservice getExs() {
		return exs;
	}
	public static void setExs(examservice exs) {
		examservice.exs = exs;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public List<Item> getItems(){
		SqlSession  sqlsession = MybatisUtil.getSqlSession(true);
		itemmapper itm = sqlsession.getMapper(itemmapper.class);
		List<Item> items = itm.select();
		return items;
	}
}
