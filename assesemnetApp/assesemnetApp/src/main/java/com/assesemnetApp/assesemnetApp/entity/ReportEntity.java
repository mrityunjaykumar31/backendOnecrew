package com.assesemnetApp.assesemnetApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ReportEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long repId;
	
	private Long studentId;
	private Long examId;
	
	public Long getRepId() {
		return repId;
	}
	public void setRepId(Long repId) {
		this.repId = repId;
	}
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
	public ReportEntity(Long repId, Long studentId, Long examId) {
		super();
		this.repId = repId;
		this.studentId = studentId;
		this.examId = examId;
	}
	@Override
	public String toString() {
		return "ReportEntity [repId=" + repId + ", studentId=" + studentId + ", examId=" + examId + "]";
	}
	
	public ReportEntity() {}
	

}
