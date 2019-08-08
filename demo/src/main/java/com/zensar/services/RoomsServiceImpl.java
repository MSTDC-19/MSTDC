package com.zensar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.RoomsDao;
import com.zensar.entities.Rooms;
@Service
@Transactional
public class RoomsServiceImpl implements RoomsService {
	@Autowired
	private RoomsDao roomsDao;
	
	public void create(Rooms rooms) {
		roomsDao.insert(rooms);

	}

	
	public void edit(Rooms rooms) {
		Rooms dbRooms=roomsDao.getById(rooms.getRoomId());
		if(dbRooms!=null) {
			dbRooms.setRoomPrice(rooms.getRoomPrice());
			dbRooms.setRoomType(rooms.getRoomType());
			
			roomsDao.update(dbRooms);
		}

	}

	
	public void remove(Rooms rooms) {
		if(rooms!=null) {
			roomsDao.delete(rooms);
		}
		else {
			System.out.println("Room Not Avaliable");
		}

	}

	
	public Rooms findById(int roomId) {
	
		return roomsDao.getById(roomId);
	}

	
	public List<Rooms> findAllRooms() {
	
		return roomsDao.getAll();
	}

}
