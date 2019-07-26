package com.zensar.mtdc.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	private String gender;
	@OneToOne
	private UserType user_type_id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public UserType getUser_type_id() {
		return user_type_id;
	}
	public void setUser_type_id(UserType user_type_id) {
		this.user_type_id = user_type_id;
	}
	public User(int id, String name, String email, String password, String gender, UserType user_type_id) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.user_type_id = user_type_id;
	}
	
	public User(){}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", user_type_id=" + user_type_id + "]";
	}
	
}
