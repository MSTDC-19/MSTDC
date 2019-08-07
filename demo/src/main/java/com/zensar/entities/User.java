package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String role;
	private String password;
	
    private String contact;
	private String email;
	
	
	public User() {
	}
	
	public User(int id, String name, String role, String password, String contact, String email) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.password = password;
		this.contact = contact;
		this.email = email;
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
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConatct() {
		return contact;
	}
	
	public void setConatct(String conatct) {
		this.contact = conatct;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + ", password=" + password + ", conatct="
				+ contact + ", email=" + email + "]";
	}
	
	
	
}

