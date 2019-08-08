package com.zensar.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Address;
import com.zensar.entities.Bill;
import com.zensar.entities.Bookings;
import com.zensar.entities.Hotel;
import com.zensar.entities.User;
import com.zensar.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelResource {
	@Autowired
	private HotelService hotelService;
	
	@GetMapping
	public List<Hotel> getAllHotel() {
		return hotelService.findAllHotels();
	}
	
	@GetMapping("/{hotelId}")	
	public Hotel getHotel(@PathVariable("hotelId") int hotelId) {
		return hotelService.findById(hotelId);
	}
	
	@PostMapping
	public String createHotel(@RequestParam("hotelId") int hotelId,@RequestParam("hotelName") String hotelName,
			@RequestParam("hotelAmenitites") String hotelAmenities,@RequestParam("hotelAddress") Address address){
	Hotel hotel=new Hotel(hotelId,hotelName,hotelAmenities,address);
	hotelService.create(hotel);
	return "Hotel "+hotelId+" added .";
	}
	
	@PutMapping
	public String editHotel(@RequestBody Hotel hotel) {
		hotelService.edit(hotel);
		return "Hotel "+hotel.getHotelId()+" edited successfully.";
	}
	
	@DeleteMapping
	public String removeHotel(@RequestBody Hotel hotel) {
		hotelService.remove(hotel);
		return " Hotel "+hotel.getHotelId()+" removed successfully.";
	}
	
	@GetMapping("/countHotel")
	public int getHotelsCount() {
		return hotelService.findAllHotels().size();
	}
}
