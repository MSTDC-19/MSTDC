package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Hotel;

public interface HotelDao {
	void insert(Hotel hotel);
	void update(Hotel hotel);
	void delete(Hotel hotel);
	Hotel getById(int hotelId);
	List<Hotel> getAll();
	
}
