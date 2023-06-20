package com.assesemnetApp.assesemnetApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class KeyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String enkey;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnkey() {
		return enkey;
	}

	public void setEnkey(String enkey) {
		this.enkey = enkey;
	}

	@Override
	public String toString() {
		return "KeyEntity [id=" + id + ", enkey=" + enkey + "]";
	}

	public KeyEntity(Long id, String enkey) {
		super();
		this.id = id;
		this.enkey = enkey;
	}
	
	public KeyEntity() {};



}
