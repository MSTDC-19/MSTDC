package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Bookings;
@Repository
public class BookingsDaoImpl implements BookingsDao {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	public void insert(Bookings booking) {
		hibernatetemplate.save(booking);

	}

	
	public void update(Bookings booking) {
		hibernatetemplate.update(booking);

	}

	
	public void delete(Bookings bookings) {
		hibernatetemplate.delete(bookings);

	}

	
	public Bookings getById(int bookingId) {
		
		return hibernatetemplate.get(Bookings.class, bookingId);
	}

	
	public List<Bookings> getAll() {
	
		return hibernatetemplate.loadAll(Bookings.class);
	}

}
