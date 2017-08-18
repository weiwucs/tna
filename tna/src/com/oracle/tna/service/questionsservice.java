package com.oracle.tna.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.tna.domain.Item;
import com.oracle.tna.user.dao.itemmapper;

import mybatis.MybatisUtil;

public class questionsservice {

	private static questionsservice ques = new questionsservice();
	public Item item;
	public questionsservice(Item item) {
		super();
		this.item = item;
	}
	public questionsservice() {
		super();
	}
	public static questionsservice getQues() {
		return ques;
	}
	public static void setQues(questionsservice ques) {
		questionsservice.ques = ques;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public List<Item> getQuestions(){
		SqlSession  sqlsession = MybatisUtil.getSqlSession(true);
		itemmapper itm = sqlsession.getMapper(itemmapper.class);
		List<Item> items = itm.select();
		return items;
	}
	public void insertQuestion(Item item){
		SqlSession  sqlsession = MybatisUtil.getSqlSession(true);
		itemmapper itm = sqlsession.getMapper(itemmapper.class);
		itm.insert(item);
		sqlsession.commit();
	}
	public void deleteQuestion(int qid){
		SqlSession  sqlsession = MybatisUtil.getSqlSession(true);
		itemmapper itm = sqlsession.getMapper(itemmapper.class);
		itm.delete(qid);
		sqlsession.commit();
	}
	public Item getQuestion(int qid){
		SqlSession  sqlsession = MybatisUtil.getSqlSession(true);
		itemmapper itm = sqlsession.getMapper(itemmapper.class);
		Item item = itm.selectByid(qid);
		sqlsession.commit();
		return item;
	}
	public void updateQuestion(Item item){
		SqlSession  sqlsession = MybatisUtil.getSqlSession(true);
		itemmapper itm = sqlsession.getMapper(itemmapper.class);
		itm.update(item);
		sqlsession.commit();
	}
	
}
