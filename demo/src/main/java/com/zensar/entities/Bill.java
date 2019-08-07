package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;
@Component
@Entity
public class Bill {
	@Id
	@GeneratedValue
	private int billId;
	@OneToOne
	private User user;
	@OneToOne
	private Hotel hotel;
	@OneToOne
	private Bookings booking;
	private float totalAmount;
	
	public Bill() {
	
	}
	
	public Bill(int billId, User user, Hotel hotel, Bookings booking, float totalAmount) {
		super();
		this.billId = billId;
		this.user = user;
		this.hotel = hotel;
		this.booking = booking;
		this.totalAmount = totalAmount;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Bookings getBooking() {
		return booking;
	}

	public void setBooking(Bookings booking) {
		this.booking = booking;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", user=" + user + ", hotel=" + hotel + ", booking=" + booking
				+ ", totalAmount=" + totalAmount + "]";
	}
	
	
	
}
