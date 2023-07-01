package com.assesemnetApp.assesemnetApp.model;

public class ReportResponseModel {

	private Long studentId;
	private Long examId;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getExamId() {
		return examId;
	}
	public void setExamId(Long examId) {
		this.examId = examId;
	}
	@Override
	public String toString() {
		return "ReportResponseModel [studentId=" + studentId + ", examId=" + examId + "]";
	}
	public ReportResponseModel(Long studentId, Long examId) {
		super();
		this.studentId = studentId;
		this.examId = examId;
	}
	
	public ReportResponseModel() {}
	
}
