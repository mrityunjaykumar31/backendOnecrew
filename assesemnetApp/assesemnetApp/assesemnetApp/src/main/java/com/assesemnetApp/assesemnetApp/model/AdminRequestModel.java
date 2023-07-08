package com.assesemnetApp.assesemnetApp.model;

public class AdminRequestModel {
	
	String user;
	String pwd;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public AdminRequestModel(String user, String pwd) {
		super();
		this.user = user;
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "AdminRequestModel [user=" + user + ", pwd=" + pwd + "]";
	}
	
	public AdminRequestModel() {}

}
