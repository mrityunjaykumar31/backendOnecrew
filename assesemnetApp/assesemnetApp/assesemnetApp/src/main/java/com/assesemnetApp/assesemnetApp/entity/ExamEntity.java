package com.assesemnetApp.assesemnetApp.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class ExamEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long examId;
	private String examName;
	private Timestamp examStartTime;
	private Timestamp examEndTime;
	private int examDuration;
	private int totalquestion;

	@ManyToOne
	@JoinColumn(name="clientid")
	private ClientEntity client;
	
	public Long getExamId() {
		return examId;
	}


	public void setExamId(Long examId) {
		this.examId = examId;
	}


	public String getExamName() {
		return examName;
	}


	public void setExamName(String examName) {
		this.examName = examName;
	}


	public Timestamp getExamStartTime() {
		return examStartTime;
	}


	public void setExamStartTime(Timestamp examStartTime) {
		this.examStartTime = examStartTime;
	}


	public Timestamp getExamEndTime() {
		return examEndTime;
	}


	public void setExamEndTime(Timestamp examEndTime) {
		this.examEndTime = examEndTime;
	}


	public int getExamDuration() {
		return examDuration;
	}


	public void setExamDuration(int examDuration) {
		this.examDuration = examDuration;
	}


	public int getTotalquestion() {
		return totalquestion;
	}


	public void setTotalquestion(int totalquestion) {
		this.totalquestion = totalquestion;
	}

	

	public ClientEntity getClient() {
		return client;
	}


	public void setClient(ClientEntity client) {
		this.client = client;
	}


	public ExamEntity(Long examId, String examName, Timestamp examStartTime, Timestamp examEndTime, int examDuration,
			int totalquestion,  ClientEntity client) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examStartTime = examStartTime;
		this.examEndTime = examEndTime;
		this.examDuration = examDuration;
		this.totalquestion = totalquestion;
		this.client = client;
	}


	public ExamEntity() {}


	@Override
	public String toString() {
		return "ExamEntity [examId=" + examId + ", examName=" + examName + ", examStartTime=" + examStartTime
				+ ", examEndTime=" + examEndTime + ", examDuration=" + examDuration + ", totalquestion=" + totalquestion
				+ ", client=" + client + "]";
	}
	
	
}
