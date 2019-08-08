package com.zensar.web;

import java.sql.Date;
import java.util.List;

import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Bookings;
import com.zensar.entities.Hotel;
import com.zensar.entities.User;
import com.zensar.services.BookingsService;
@RestController
@RequestMapping("/bookings")
public class BookingsResource {
	@Autowired
	private BookingsService bookingsService;
	
	@GetMapping
	public List<Bookings> getAllBookings(){
		return bookingsService.findAllBookings();
	}
	
	@GetMapping("/{bookingId}")
	public Bookings getBookings(@RequestParam("bookingId") int bookingId) {
		return bookingsService.findById(bookingId);
	}
	
	@PostMapping
	public String createBooking(@RequestParam("bookingId") int bookingId,@RequestParam("bookingstatus") String bookingstatus,
			@RequestParam("user") User user,@RequestParam("hotel") Hotel hotel, @RequestParam("startDate") Date date,
			@RequestParam("endDate") Date date1,@RequestParam("noOfRooms") int noOfRooms) {
		Bookings bookings=new Bookings(bookingId,bookingstatus,user,hotel,date,date1,noOfRooms);
		bookingsService.create(bookings);
		return "Bookings "+bookingId+" done";
	}
	
	
	@PutMapping
	public String editBooking(@RequestBody Bookings bookings) {
		bookingsService.edit(bookings);
		return " Booking "+bookings.getBookingId()+" edited successfully";
	}
	
	@DeleteMapping
	public String removeBooking(@RequestBody Bookings bookings) {
		bookingsService.remove(bookings);
		return "Booking "+bookings.getBookingId()+" removed."; 
	}
	
	@GetMapping("/countBookings")
	public int getBookingsCount() {
		return bookingsService.findAllBookings().size();
	}

}










