package com.assesemnetApp.assesemnetApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clientid;
	private String clientname;
	private String clientpassword;
	
	

	public Long getClientid() {
		return clientid;
	}
	public void setClientid(Long clientid) {
		this.clientid = clientid;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getClientpassword() {
		return clientpassword;
	}
	public void setClientpassword(String clientpassword) {
		this.clientpassword = clientpassword;
	}
	
	public Client(Long clientid, String clientname, String clientpassword) {
		super();
		this.clientid = clientid;
		this.clientname = clientname;
		this.clientpassword = clientpassword;
	}
	
	public Client() {};
	
	@Override
	public String toString() {
		return "Client [clientid=" + clientid + ", clientname=" + clientname + ", clientpassword=" + clientpassword
				+ "]";
	}
	
	
	
	
	
	

}
