package com.assesemnetApp.assesemnetApp.model;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


public class AnswerResponseModel {
	
	
	private List<Answer> answer;
	private String startTime;
	private String endTime;
	private Long studentId;
	private Long clientid;
	private Long examId;
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
	public Long getClientid() {
		return clientid;
	}
	public void setClientid(Long clientid) {
		this.clientid = clientid;
	}
	
	
	public Long getExamId() {
		return examId;
	}
	public void setExamId(Long examId) {
		this.examId = examId;
	}
	public AnswerResponseModel(List<Answer> answer, String startTime, String endTime, Long studentId, Long clientid, Long examId) {
		super();
		this.answer = answer;
		this.startTime = startTime;
		this.endTime = endTime;
		this.studentId = studentId;
		this.clientid = clientid;
		this.examId = examId;
	}
	
	public AnswerResponseModel(){}
	@Override
	public String toString() {
		return "AnswerResponseModel [answer=" + answer + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", studentId=" + studentId + ", clientid=" + clientid + ", examId="+examId+"]";
	}
	
	
	
}
