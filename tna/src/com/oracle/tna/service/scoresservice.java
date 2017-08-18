package com.oracle.tna.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.tna.domain.Score;
import com.oracle.tna.user.dao.scoremapper;

import mybatis.MybatisUtil;

public class scoresservice {

	public static scoresservice scos = new scoresservice();
	public Score score;
	
	public scoresservice() {
		super();
	}

	public scoresservice(Score score) {
		super();
		this.score = score;
	}

	public static scoresservice getScos() {
		return scos;
	}

	public static void setScos(scoresservice scos) {
		scoresservice.scos = scos;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public List<Score> getScores(){
		SqlSession  sqlsession = MybatisUtil.getSqlSession(true);
		scoremapper scm = sqlsession.getMapper(scoremapper.class);
		List<Score> Scores = scm.select();
		return Scores;
	}
	
	public Score getScoreByUid(int uid){
		SqlSession  sqlsession = MybatisUtil.getSqlSession(true);
		scoremapper scm = sqlsession.getMapper(scoremapper.class);
		System.out.println(uid);
		Score score = scm.selectByUid(uid);
		System.out.println(score);
		return score;
	}
	
	public void insertScore(Score score){
		SqlSession  sqlsession = MybatisUtil.getSqlSession(true);
		scoremapper scm = sqlsession.getMapper(scoremapper.class);
		scm.insert(score);
		sqlsession.commit();
	}
}
