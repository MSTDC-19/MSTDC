package com.zensar.mtdc.service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserType {
	@Id
	private int id;
	private String name;
	

	
	public UserType(){
		
	}
	
	
	public UserType(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "UserType [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	
}
