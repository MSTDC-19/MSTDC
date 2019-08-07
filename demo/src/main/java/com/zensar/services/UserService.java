package com.zensar.services;

import java.util.List;

import com.zensar.entities.User;

public interface UserService {
	void create(User user);
	void edit(User user);
	void remove(User user);
	User findById(int id);
	List<User> findAllUsers();
}
