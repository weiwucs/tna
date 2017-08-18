package com.oracle.tna.domain;

import java.sql.Timestamp;

public class Score {

	private int sid;
	private Timestamp data;
	private int score;
	private String answer;
	private String s_answer;
	private int USER_UID;
	
	public Score() {
		super();
	}
	public Score(int sid, Timestamp data, int score, String answer, String s_answer, int uSER_UID) {
		super();
		this.sid = sid;
		this.data = data;
		this.score = score;
		this.answer = answer;
		this.s_answer = s_answer;
		USER_UID = uSER_UID;
	}
	
	public Score(Timestamp data, int score, String answer, String s_answer, int uSER_UID) {
		super();
		this.data = data;
		this.score = score;
		this.answer = answer;
		this.s_answer = s_answer;
		USER_UID = uSER_UID;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Timestamp getData() {
		return data;
	}
	public void setData(Timestamp data) {
		this.data = data;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getS_answer() {
		return s_answer;
	}
	public void setS_answer(String s_answer) {
		this.s_answer = s_answer;
	}
	public int getUSER_UID() {
		return USER_UID;
	}
	public void setUSER_UID(int uSER_UID) {
		USER_UID = uSER_UID;
	}
	@Override
	public String toString() {
		return "Score [sid=" + sid + ", data=" + data + ", score=" + score + ", answer=" + answer + ", s_answer="
				+ s_answer + ", USER_UID=" + USER_UID + "]";
	}	
}
