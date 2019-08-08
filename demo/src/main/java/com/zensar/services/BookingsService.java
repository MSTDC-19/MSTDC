package com.zensar.services;

import java.util.List;

import com.zensar.entities.Bookings;

public interface BookingsService {
	void create(Bookings bookings);
	void edit(Bookings bookings);
	void remove(Bookings bookings);
	Bookings findById(int bookingId);
	List<Bookings> findAllBookings();
}
