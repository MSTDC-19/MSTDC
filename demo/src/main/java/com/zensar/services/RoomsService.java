package com.zensar.services;

import java.util.List;

import com.zensar.entities.Rooms;

public interface RoomsService {
	void create(Rooms rooms);
	void edit(Rooms rooms);
	void remove(Rooms rooms);
	Rooms findById(int roomId);
	List<Rooms> findAllRooms();
}
