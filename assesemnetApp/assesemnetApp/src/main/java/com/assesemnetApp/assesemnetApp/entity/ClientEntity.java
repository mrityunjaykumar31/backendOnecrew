package com.assesemnetApp.assesemnetApp.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ClientEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clientid;
	
	private String clientname;
	private String clientpassword;
	
	private Long examDuration;
	private Long totalQuestionTobeShown;

	public Long getExamDuration() {
		return examDuration;
	}
	public void setExamDuration(Long examDuration) {
		this.examDuration = examDuration;
	}
	public Long getTotalQuestionTobeShown() {
		return totalQuestionTobeShown;
	}
	public void setTotalQuestionTobeShown(Long totalQuestionTobeShown) {
		this.totalQuestionTobeShown = totalQuestionTobeShown;
	}

	
	@SuppressWarnings("unchecked")
	@OneToMany(mappedBy="questionId")
	 List<QuestionEntity>question = new java.util.ArrayList();
	@OneToMany(mappedBy="studentId")
	 List<StudentEntity>student = new java.util.ArrayList();

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
	
	public ClientEntity(Long clientid, String clientname, String clientpassword, Long examDuration,
			Long totalQuestionTobeShown) {
		super();
		this.clientid = clientid;
		this.clientname = clientname;
		this.clientpassword = clientpassword;
		this.examDuration = examDuration;
		this.totalQuestionTobeShown = totalQuestionTobeShown;
	}
	
	public ClientEntity() {};
	
	@Override
	public String toString() {
		return "Client [clientid=" + clientid + ", clientname=" + clientname + ", clientpassword=" + clientpassword
				+ ", examDuration=" + examDuration + ", totalQuestionTobeShown=" + totalQuestionTobeShown + "]";
	}
	
	
	
	
	
	

}
