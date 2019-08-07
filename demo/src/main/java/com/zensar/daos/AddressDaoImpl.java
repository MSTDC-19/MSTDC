package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Address;
@Repository
public class AddressDaoImpl implements AddressDao {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	public void insert(Address address) {
		hibernatetemplate.save(address);

	}


	public void update(Address address) {
		hibernatetemplate.update(address);

	}

	
	public void delete(Address address) {
		hibernatetemplate.delete(address);

	}

	
	public Address getById(int id) {
	
		return hibernatetemplate.get(Address.class, id);
	}

	
	public List<Address> getAll() {
	
		return hibernatetemplate.loadAll(Address.class);
	}

}
