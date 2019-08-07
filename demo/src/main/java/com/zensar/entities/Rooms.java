package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Rooms {
	@Autowired
	@ManyToOne
	private Hotel hotel;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int roomId;
	private String roomType;
	private float roomPrice;
	
	public Rooms() {
	
	}

	public Rooms(int roomId, String roomType, float roomPrice) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public float getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(float roomPrice) {
		this.roomPrice = roomPrice;
	}

	@Override
	public String toString() {
		return "Rooms [hotel=" + hotel + ", roomId=" + roomId + ", roomType=" + roomType + ", roomPrice=" + roomPrice + "]";
	}
	
	
	
	
	
	
}
