package com.assesemnetApp.assesemnetApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	private String studentFirstname;
	private String studentLastname;
	private String studentEnrollmentNo;
	

	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentFirstname() {
		return studentFirstname;
	}
	public void setStudentFirstname(String studentFirstname) {
		this.studentFirstname = studentFirstname;
	}
	public String getStudentLastname() {
		return studentLastname;
	}
	public void setStudentLastname(String studentLastname) {
		this.studentLastname = studentLastname;
	}
	public String getStudentEnrollmentNo() {
		return studentEnrollmentNo;
	}
	public void setStudentEnrollmentNo(String studentEnrollmentNo) {
		this.studentEnrollmentNo = studentEnrollmentNo;
	}
	
	public StudentEntity(Long studentId, String studentFirstname, String studentLastname, String studentEnrollmentNo) {
		super();
		this.studentId = studentId;
		this.studentFirstname = studentFirstname;
		this.studentLastname = studentLastname;
		this.studentEnrollmentNo = studentEnrollmentNo;
	}
	
	public StudentEntity() {}
	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentFirstname=" + studentFirstname + ", studentLastname="
				+ studentLastname + ", studentEnrollmentNo=" + studentEnrollmentNo + "]";
	};
	
	

}
