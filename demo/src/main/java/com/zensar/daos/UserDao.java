package com.zensar.daos;

import java.util.List;

import com.zensar.entities.User;

public interface UserDao {
	void insert(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
	List<User> getAll();
}
