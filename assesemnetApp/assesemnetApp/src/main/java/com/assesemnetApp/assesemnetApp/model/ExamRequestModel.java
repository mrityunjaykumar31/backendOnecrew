package com.assesemnetApp.assesemnetApp.model;

import java.sql.Timestamp;

public class ExamRequestModel {
	private String examName;
	private String examStartTime;
	private String examEndTime;
	private int examDuration;
	private int totalquestion;
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getExamStartTime() {
		return examStartTime;
	}
	public void setExamStartTime(String examStartTime) {
		this.examStartTime = examStartTime;
	}
	public String getExamEndTime() {
		return examEndTime;
	}
	public void setExamEndTime(String examEndTime) {
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
	public ExamRequestModel(String examName, String examStartTime, String examEndTime, int examDuration,
			int totalquestion) {
		super();
		this.examName = examName;
		this.examStartTime = examStartTime;
		this.examEndTime = examEndTime;
		this.examDuration = examDuration;
		this.totalquestion = totalquestion;
	}
	@Override
	public String toString() {
		return "ExamRequestModel [examName=" + examName + ", examStartTime=" + examStartTime + ", examEndTime="
				+ examEndTime + ", examDuration=" + examDuration + ", totalquestion=" + totalquestion + "]";
	}
	
	
	
}
