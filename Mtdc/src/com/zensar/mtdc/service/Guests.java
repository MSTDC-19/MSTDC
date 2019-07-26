package com.zensar.mtdc.service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Guests {
	@Id
	private int id;
	private String name;
	private int age;
	private int bookingId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Guests(int id, String name, int age, int bookingId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bookingId = bookingId;
	}
	
	public Guests(){}
	@Override
	public String toString() {
		return "Guests [id=" + id + ", name=" + name + ", age=" + age + ", bookingId=" + bookingId + "]";
	}
	
	
	
	
}
