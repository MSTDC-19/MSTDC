package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Bookings;

public interface BookingsDao {
	void insert(Bookings booking);
	void update(Bookings bookings);
	void delete(Bookings bookings);
	Bookings getById(int bookingId);
	List<Bookings> getAll();
}
