package com.assesemnetApp.assesemnetApp.model;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.entity.StudentEntity;

public class ClientResponseModel {
	
	private String message;	
	private boolean isSuccess;
	ClientEntity clientDetails;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public ClientEntity getClientDetails() {
		return clientDetails;
	}
	public void setClientDetails(ClientEntity clientDetails) {
		this.clientDetails = clientDetails;
	}
	
	public ClientResponseModel(){}
	
	public ClientResponseModel(String message, boolean isSuccess, ClientEntity clientDetails) {
		super();
		this.message = message;
		this.isSuccess = isSuccess;
		this.clientDetails = clientDetails;
	}
	@Override
	public String toString() {
		return "ClientResponseModel [message=" + message + ", isSuccess=" + isSuccess + ", clientDetails="
				+ clientDetails + "]";
	}
	
}
