package com.zensar.services;

import java.util.List;

import com.zensar.entities.Hotel;

public interface HotelService {
	void create(Hotel hotel);
	void edit(Hotel hotel);
	void remove(Hotel hotel);
	Hotel findById(int hotelId);
	List<Hotel> findAllHotels();
}
