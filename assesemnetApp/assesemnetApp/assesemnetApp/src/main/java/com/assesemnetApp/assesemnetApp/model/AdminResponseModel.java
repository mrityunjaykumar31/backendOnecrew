package com.assesemnetApp.assesemnetApp.model;


public class AdminResponseModel {
 private boolean isSuccess;
 private String message;
 
public boolean isSuccess() {
	return isSuccess;
}
public void setSuccess(boolean isSuccess) {
	this.isSuccess = isSuccess;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public AdminResponseModel(boolean isSuccess, String message) {
	super();
	this.isSuccess = isSuccess;
	this.message = message;
}
@Override
public String toString() {
	return "AdminResponseModel [isSuccess=" + isSuccess + ", message=" + message + "]";
}
 
 public AdminResponseModel() {}
 
}
