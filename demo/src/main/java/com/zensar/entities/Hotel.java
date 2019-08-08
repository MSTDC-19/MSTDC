package com.zensar.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Hotel {
	@Id
	private int hotelId;
	private String hotelName;
	private String hotelAmenities;
	
	@OneToOne
	private Address address;
	
	
	
	public Hotel() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Hotel(int hotelId, String hotelName, String hotelAmenities, Address address) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelAmenities = hotelAmenities;
		this.address = address;
	}



	public int getHotelId() {
		return hotelId;
	}
	
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	


	public String getHotelAmenities() {
		return hotelAmenities;
	}

	public void setHotelAmenities(String hotelAmenities) {
		this.hotelAmenities = hotelAmenities;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	


	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAmenities=" + hotelAmenities
				+ ", address=" + address + "]";
	}

	

	
}
