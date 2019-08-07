package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Rooms;

public interface RoomsDao {
	void insert(Rooms room);
	void update(Rooms room);
	void delete(Rooms room);
	Rooms getById(int roomId);
	List<Rooms> getAll(); 
}
