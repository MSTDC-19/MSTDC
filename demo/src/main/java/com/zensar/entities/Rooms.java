package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Rooms {
	
	@ManyToOne
	private Hotel hotel;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int roomId;
	private String roomType;
	private float roomPrice;
	
	public Rooms() {
	
	}

	

	public Rooms(int roomId, String roomType, float roomPrice, Hotel hotel) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.hotel = hotel;
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
		return "Rooms [hotel=" + hotel + ", roomId=" + roomId + ", roomType=" + roomType + ", roomPrice=" + roomPrice
				+ "]";
	}



	public Hotel getHotel() {
		return hotel;
	}



	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	
	
	
	
	
	
	
}
