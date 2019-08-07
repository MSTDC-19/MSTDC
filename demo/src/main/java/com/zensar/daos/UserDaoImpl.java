package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	public void insert(User user) {
		hibernatetemplate.save(user);	
	
	}

	
	public void update(User user) {
		hibernatetemplate.update(user);
	}

	
	public void delete(User user) {
		hibernatetemplate.delete(user);
	}

	
	public User getById(int id) {
		return hibernatetemplate.get(User.class, id);
	}

	
	public List<User> getAll() {
		return hibernatetemplate.loadAll(User.class);
	}

}
