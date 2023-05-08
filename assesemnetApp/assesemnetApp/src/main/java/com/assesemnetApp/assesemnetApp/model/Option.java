package com.assesemnetApp.assesemnetApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


public class Option {
	
	public Option( String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}


	private String key;
	private String value;
	
	@Override
	public String toString() {
		return "Option [ key=" + key + ", value=" + value + "]";
	}
	

	public Option(){}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
