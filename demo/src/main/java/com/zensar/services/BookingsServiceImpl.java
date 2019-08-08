package com.zensar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.BookingsDao;
import com.zensar.entities.Bookings;
@Service
@Transactional
public class BookingsServiceImpl implements BookingsService {
	
	@Autowired
	private BookingsDao bookingsDao;
	
	public void create(Bookings bookings) {
		bookingsDao.insert(bookings);

	}

	
	public void edit(Bookings bookings) {
		Bookings dbBookings=bookingsDao.getById(bookings.getBookingId());
		if(dbBookings!=null) {
			dbBookings.setBookingStatus(bookings.getBookingStatus());
			dbBookings.setStartDate(bookings.getStartDate());
			dbBookings.setEndDate(bookings.getEndDate());
			dbBookings.setNoOfRooms(bookings.getNoOfRooms());
			dbBookings.setUser(bookings.getUser());
			
			bookingsDao.update(dbBookings);
		}

	}

	
	public void remove(Bookings bookings) {
		if(bookings!=null) {
			bookingsDao.delete(bookings);
		}

	}

	
	public Bookings findById(int bookingId) {
	
		return bookingsDao.getById(bookingId);
	}

	
	public List<Bookings> findAllBookings() {
	
		return bookingsDao.getAll();
	}

}
