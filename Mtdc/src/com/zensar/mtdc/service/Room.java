package com.zensar.mtdc.service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Room {
	@Id
	private int id;
	private String roomDescription;
	private String roomType;
	private double price;
	
	
	
	public Room(){
		
	}
	
	
	
	public Room(int id, String roomDescription, String roomType, double price) {
		super();
		this.id = id;
		this.roomDescription = roomDescription;
		this.roomType = roomType;
		this.price = price;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoomDescription() {
		return roomDescription;
	}
	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Room [id=" + id + ", roomDescription=" + roomDescription + ", roomType=" + roomType + ", price=" + price
				+ "]";
	}
	
	
	
	
}
