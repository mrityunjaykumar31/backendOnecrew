package com.assesemnetApp.assesemnetApp.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

public class StudentDetails {
	private Long studentId;
	private Long cientId;
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
	private Date examTime;
	private Long emrno;
	private String orgName;
	private String institutionName; 
	private Long aadharNumber;
	private String panNo; 
	private String state;
	private Long pinCode;
	private String highestQual;
	private Long yearOfPassing;
	private boolean isAttendentPsychometricTestBefore;
	private Timestamp examStartTime;
	private Timestamp examEndTime;
	private Long examId;
	
	
	public Long getExamId() {
		return examId;
	}
	public void setExamId(Long examId) {
		this.examId = examId;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getCientId() {
		return cientId;
	}
	public void setCientId(Long cientId) {
		this.cientId = cientId;
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
	public Long getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public void setStudentMobileNumber(Long studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	public String getStudentFatherName() {
		return studentFatherName;
	}
	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
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
	public Date getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}
	public Date getExamTime() {
		return examTime;
	}
	public void setExamTime(Date examTime) {
		this.examTime = examTime;
	}
	public Long getEmrno() {
		return emrno;
	}
	public void setEmrno(Long emrno) {
		this.emrno = emrno;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public Long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPinCode() {
		return pinCode;
	}
	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}
	public String getHighestQual() {
		return highestQual;
	}
	public void setHighestQual(String highestQual) {
		this.highestQual = highestQual;
	}
	public Long getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(Long yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	public boolean isAttendentPsychometricTestBefore() {
		return isAttendentPsychometricTestBefore;
	}
	public void setAttendentPsychometricTestBefore(boolean isAttendentPsychometricTestBefore) {
		this.isAttendentPsychometricTestBefore = isAttendentPsychometricTestBefore;
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
	public StudentDetails(Long studentId, Long cientId, String studentFirstname, String studentLastname,
			String studentEnrollmentNo, Long studentMobileNumber, String studentFatherName, String studentaddress,
			String studentEmail, String studentBranch, String studentClientId, String studentSetAssign,
			String studentStatus, Long studentMarks, String studentGender, String studentState, Date studentDob,
			Date examTime, Long emrno, String orgName, String institutionName, Long aadharNumber, String panNo,
			String state, Long pinCode, String highestQual, Long yearOfPassing,
			boolean isAttendentPsychometricTestBefore, Timestamp examStartTime, Timestamp examEndTime,Long examId) {
		super();
		this.studentId = studentId;
		this.cientId = cientId;
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
		this.examTime = examTime;
		this.emrno = emrno;
		this.orgName = orgName;
		this.institutionName = institutionName;
		this.aadharNumber = aadharNumber;
		this.panNo = panNo;
		this.state = state;
		this.pinCode = pinCode;
		this.highestQual = highestQual;
		this.yearOfPassing = yearOfPassing;
		this.isAttendentPsychometricTestBefore = isAttendentPsychometricTestBefore;
		this.examStartTime = examStartTime;
		this.examEndTime = examEndTime;
		this.examId = examId;
	}
	
	public StudentDetails() {}
	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", cientId=" + cientId + ", studentFirstname="
				+ studentFirstname + ", studentLastname=" + studentLastname + ", studentEnrollmentNo="
				+ studentEnrollmentNo + ", studentMobileNumber=" + studentMobileNumber + ", studentFatherName="
				+ studentFatherName + ", studentaddress=" + studentaddress + ", studentEmail=" + studentEmail
				+ ", studentBranch=" + studentBranch + ", studentClientId=" + studentClientId + ", studentSetAssign="
				+ studentSetAssign + ", studentStatus=" + studentStatus + ", studentMarks=" + studentMarks
				+ ", studentGender=" + studentGender + ", studentState=" + studentState + ", studentDob=" + studentDob
				+ ", examTime=" + examTime + ", emrno=" + emrno + ", orgName=" + orgName + ", institutionName="
				+ institutionName + ", aadharNumber=" + aadharNumber + ", panNo=" + panNo + ", state=" + state
				+ ", pinCode=" + pinCode + ", highestQual=" + highestQual + ", yearOfPassing=" + yearOfPassing
				+ ", isAttendentPsychometricTestBefore=" + isAttendentPsychometricTestBefore + ", examStartTime="
				+ examStartTime + ", examEndTime=" + examEndTime + ", examId=" + examId + "]";
	}
	

}
