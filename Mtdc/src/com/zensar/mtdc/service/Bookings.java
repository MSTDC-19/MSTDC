package com.zensar.mtdc.service;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Bookings {
	@Id
	private int id;
	private String bookingUserName;
	
	@Temporal(value= TemporalType.TIMESTAMP)
	private Date startDate;
	@Temporal(value= TemporalType.TIMESTAMP)
	private Date endDate;
	private String bookingStatus;
	private int numberOfRooms;
	@OneToOne
	private User userId;
	@OneToOne
	private Hotel hotelId;
	@OneToOne
	private Room roomId;
	
	public Bookings(){
		
	}
	
	public Bookings(int id, String bookingUserName, User userId, Date startDate, Date endDate, String bookingStatus,
			Hotel hotelId, Room roomId, int numberOfRooms) {
		super();
		this.id = id;
		this.bookingUserName = bookingUserName;
		this.userId = userId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.bookingStatus = bookingStatus;
		this.hotelId = hotelId;
		this.roomId = roomId;
		this.numberOfRooms = numberOfRooms;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookingUserName() {
		return bookingUserName;
	}
	public void setBookingUserName(String bookingUserName) {
		this.bookingUserName = bookingUserName;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date date) {
		this.startDate =  date;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public Hotel getHotelId() {
		return hotelId;
	}
	public void setHotelId(Hotel hotelId) {
		this.hotelId = hotelId;
	}
	public Room getRoomId() {
		return roomId;
	}
	public void setRoomId(Room roomId) {
		this.roomId = roomId;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	@Override
	public String toString() {
		return "Bookings [id=" + id + ", bookingUserName=" + bookingUserName + ", userId=" + userId + ", startDate="
				+ startDate + ", endDate=" + endDate + ", bookingStatus=" + bookingStatus + ", hotelId=" + hotelId
				+ ", roomId=" + roomId + ", numberOfRooms=" + numberOfRooms + "]";
	}
	
	
}
