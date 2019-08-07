package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Rooms;
@Repository
public class RoomsDaoImpl implements RoomsDao {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	public void insert(Rooms room) {
		hibernatetemplate.save(room);

	}

	
	public void update(Rooms room) {
		hibernatetemplate.update(room);

	}

	
	public void delete(Rooms room) {
		hibernatetemplate.delete(room);

	}

	
	public Rooms getById(int roomId) {
	
		return hibernatetemplate.get(Rooms.class, roomId);
	}

	
	public List<Rooms> getAll() {
	
		return hibernatetemplate.loadAll(Rooms.class);
	}

}
