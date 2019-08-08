package com.zensar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.HotelDao;
import com.zensar.entities.Hotel;
@Service
@Transactional
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelDao hotelDao;
	
	public void create(Hotel hotel) {
		hotelDao.insert(hotel);

	}

	
	public void edit(Hotel hotel) {
		Hotel dbHotel=hotelDao.getById(hotel.getHotelId());
		if(dbHotel!=null) {
			dbHotel.setHotelName(hotel.getHotelName());
			dbHotel.setAddress(hotel.getAddress());
			dbHotel.setHotelAmenities(hotel.getHotelAmenities());
			
			hotelDao.update(dbHotel);
		}

	}

	
	public void remove(Hotel hotel) {
		if(hotel!=null) {
			hotelDao.delete(hotel);
		}
		else {
			System.out.println("Hotel not present!!");
		}

	}

	
	public Hotel findById(int hotelId) {
	
		return hotelDao.getById(hotelId);
	}

	
	public List<Hotel> findAllHotels() {
	
		return hotelDao.getAll();
	}

}
