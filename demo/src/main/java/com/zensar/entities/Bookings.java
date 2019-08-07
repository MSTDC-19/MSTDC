package com.zensar.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;
@Component
@Entity
public class Bookings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bookingId;
	private String bookingStatus;
	@ManyToOne
	private User user;
	
	@Autowired
	@ManyToOne
	private Hotel hotel;
	private Date startDate;
	private Date endDate;
	private int noOfRooms;
	
	
	public Bookings() {
	
	}


	public Bookings(int bookingId, String bookingStatus, User user, Date startDate, Date endDate, int noOfRooms) {
		super();
		this.bookingId = bookingId;
		this.bookingStatus = bookingStatus;
		this.user = user;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfRooms = noOfRooms;
	}


	@Override
	public String toString() {
		return "Bookings [bookingId=" + bookingId + ", bookingStatus=" + bookingStatus + ", user=" + user
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", noOfRooms=" + noOfRooms + "]";
	}


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public int getNoOfRooms() {
		return noOfRooms;
	}


	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}


	
	
}
