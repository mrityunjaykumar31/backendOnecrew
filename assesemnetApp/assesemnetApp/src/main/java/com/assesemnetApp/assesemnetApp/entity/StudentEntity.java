package com.assesemnetApp.assesemnetApp.entity;

import java.sql.Date;

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
	private Long   studentMobileNumber;
	private String studentFatherName;
	private String studentaddress;
	private String studentEmail;
	private String studentBranch;
	private String studentClientId;
	private String studentSetAssign;
	private String studentStatus;
	private Long   studentMarks;
	private String studentGender;
	private String studentState;
	private Date studentDob;  
	
	

	
	
	
	public StudentEntity(Long studentId, String studentFirstname, String studentLastname, String studentEnrollmentNo,
			Long studentMobileNumber, String studentFatherName, String studentaddress, String studentEmail,
			String studentBranch, String studentClientId, String studentSetAssign, String studentStatus,
			Long studentMarks, String studentGender, String studentState, Date studentDob) {
		super();
		this.studentId = studentId;
		this.studentFirstname = studentFirstname;
		this.studentLastname = studentLastname;
		this.studentEnrollmentNo = studentEnrollmentNo;
		this.studentMobileNumber = studentMobileNumber;
		this.studentFatherName = studentFatherName;
		this.studentaddress = studentaddress;
		this.studentEmail = studentEmail;
		this.studentBranch = studentBranch;
		this.studentClientId = studentClientId;
		this.studentSetAssign = studentSetAssign;
		this.studentStatus = studentStatus;
		this.studentMarks = studentMarks;
		this.studentGender = studentGender;
		this.studentState = studentState;
		this.studentDob = studentDob;
	}
	public Date getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public String getStudentClientId() {
		return studentClientId;
	}
	public void setStudentClientId(String studentClientId) {
		this.studentClientId = studentClientId;
	}
	public String getStudentSetAssign() {
		return studentSetAssign;
	}
	public void setStudentSetAssign(String studentSetAssign) {
		this.studentSetAssign = studentSetAssign;
	}
	public String getStudentStatus() {
		return studentStatus;
	}
	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}
	public Long getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(Long studentMarks) {
		this.studentMarks = studentMarks;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public String getStudentState() {
		return studentState;
	}
	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	public String getStudentFatherName() {
		return studentFatherName;
	}
	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}
	public Long getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public void setStudentMobileNumber(Long studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
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
	
	
	public StudentEntity() {}
	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentFirstname=" + studentFirstname + ", studentLastname="
				+ studentLastname + ", studentEnrollmentNo=" + studentEnrollmentNo + ", studentMobileNumber="
				+ studentMobileNumber + ", studentFatherName=" + studentFatherName + ", studentaddress="
				+ studentaddress + ", studentEmail=" + studentEmail + ", studentBranch=" + studentBranch
				+ ", studentClientId=" + studentClientId + ", studentSetAssign=" + studentSetAssign + ", studentStatus="
				+ studentStatus + ", studentMarks=" + studentMarks + ", studentGender=" + studentGender
				+ ", studentState=" + studentState + ", studentDob=" + studentDob + "]";
	};
	
	

}
