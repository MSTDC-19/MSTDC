package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Hotel;
@Repository
public class HotelDaoImpl implements HotelDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	public void insert(Hotel hotel) {
		hibernatetemplate.save(hotel);

	}

	
	public void update(Hotel hotel) {
		hibernatetemplate.update(hotel);

	}

	
	public void delete(Hotel hotel) {
		hibernatetemplate.delete(hotel);

	}

	
	public Hotel getById(int hotelId) {
	
		return hibernatetemplate.get(Hotel.class, hotelId);
	}

	
	public List<Hotel> getAll() {
	
		return hibernatetemplate.loadAll(Hotel.class);
	}

}
