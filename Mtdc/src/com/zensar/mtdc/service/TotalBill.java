package com.zensar.mtdc.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TotalBill {
	
	@Id
	private int billId;
	@OneToOne
	private Bookings bookingId;
	@OneToOne
	private Room roomId;
	@OneToOne
	private User userId;
	@OneToOne
	private Hotel hotelId;
	private double totalamount;
	@Override
	public String toString() {
		return "TotalBill [billId=" + billId + ", bookingId=" + bookingId + ", roomId=" + roomId + ", userId=" + userId
				+ ", hotelId=" + hotelId + ", totalamount=" + totalamount + "]";
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public Bookings getBookingId() {
		return bookingId;
	}
	public void setBookingId(Bookings bookingId) {
		this.bookingId = bookingId;
	}
	public Room getRoomId() {
		return roomId;
	}
	public void setRoomId(Room roomId) {
		this.roomId = roomId;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public Hotel getHotelId() {
		return hotelId;
	}
	public void setHotelId(Hotel hotelId) {
		this.hotelId = hotelId;
	}
	public double getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}
	public TotalBill(int billId, Bookings bookingId, Room roomId, User userId, Hotel hotelId, double totalamount) {
		super();
		this.billId = billId;
		this.bookingId = bookingId;
		this.roomId = roomId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.totalamount = totalamount;
	}
	public TotalBill() {
		super();
	}
	
	
	
	
	
}
