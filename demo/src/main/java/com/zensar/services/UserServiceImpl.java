package com.zensar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.UserDao;
import com.zensar.entities.User;
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
	public void create(User user) {
		dao.insert(user);

	}

	
	public void edit(User user) {
		User dbuser=dao.getById(user.getId());
		if(dbuser!=null) {
			dbuser.setName(user.getName());
			dbuser.setRole(user.getRole());
			dbuser.setPassword(user.getPassword());
			dbuser.setConatct(user.getConatct());
			dbuser.setEmail(user.getEmail());
			
			dao.update(user);	
		}


	}

	
	public void remove(User user) {
		if(user!=null)
			dao.delete(user);
		else
			System.out.println("No such User!!");
	}

	
	public User findById(int id) {
	
		return dao.getById(id);
	}

	
	public List<User> findAllUsers() {
	
		return dao.getAll();
	}

}
