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

import com.zensar.entities.Hotel;
import com.zensar.entities.Rooms;
import com.zensar.entities.User;
import com.zensar.services.RoomsService;

@RestController
@RequestMapping("/rooms")
public class RoomsResource {
	@Autowired
	private RoomsService roomsService;
	
	@GetMapping
	public List<Rooms> getAllRooms() {
		return roomsService.findAllRooms();
	}
	
	@GetMapping("/{roomId}")	
	public Rooms getRooms(@PathVariable("roomId") int roomId) {
		return roomsService.findById(roomId);
	}
	
	@PostMapping
	public String createRoom(@RequestParam("roomId") int roomId,@RequestParam("roomType") String roomType,
			@RequestParam("roomPrice") float roomPrice,@RequestParam("hotel") Hotel hotel) {
	Rooms rooms=new Rooms(roomId,roomType,roomPrice,hotel);
	roomsService.create(rooms);
	return "Room "+roomId+" created successfully.";
	}
	
	@PutMapping
	public String editRooms(@RequestBody Rooms rooms) {
		roomsService.edit(rooms);
		return "Room "+rooms.getRoomId()+" edited successfully.";
	}
	
	@DeleteMapping
	public String removeRooms(@RequestBody Rooms rooms) {
		roomsService.remove(rooms);
		return " Room "+rooms.getRoomId()+" removed successfully.";
	}
	
	@GetMapping("/countRooms")
	public int getRoomsCount() {
		return roomsService.findAllRooms().size();
	}
}
