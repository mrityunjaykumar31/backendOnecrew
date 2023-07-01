package com.assesemnetApp.assesemnetApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdminEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long adminId;
	 @Column(name = "admin_user",columnDefinition = "varchar(255) default 'onecrew'")
	private String adminUser;
	 @Column(name = "admin_pass",columnDefinition = "varchar(255) default 'Optra@123'")
	private String adminPass;
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public String getAdminUser() {
		return adminUser;
	}
	public void setAdminUser(String adminUser) {
		this.adminUser = adminUser;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	@Override
	public String toString() {
		return "AdminEntity [adminId=" + adminId + ", adminUser=" + adminUser + ", adminPass=" + adminPass + "]";
	}
	public AdminEntity(Long adminId, String adminUser, String adminPass) {
		super();
		this.adminId = adminId;
		this.adminUser = adminUser;
		this.adminPass = adminPass;
	}
	
	public AdminEntity() {
		this.adminUser="onecrew";
		this.adminPass="Optra@123";
	}
}
