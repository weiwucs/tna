package com.oracle.tna.domain;

public class User {

	private int uid;
	private String username;
	private String password;
	private String name;
	private String idnumber;
	private String telno;
	private int admintype;

	public User() {
		super();
	}

	public User(String username, String password,String name, String idnumber, String telno,
			int admintype) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.idnumber = idnumber;
		this.telno = telno;
		this.admintype = admintype;
	}

	public User(int uid, String username, String password, String name, String idnumber,
			String telno, int admintype) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.name = name;
		this.idnumber = idnumber;
		this.telno = telno;
		this.admintype = admintype;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public int getAdmintype() {
		return admintype;
	}

	public void setAdmintype(int admintype) {
		this.admintype = admintype;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password
				+ ", name=" + name + ", idnumber=" + idnumber + ", telno=" + telno + ", admintype=" + admintype + "]";
	}
}
