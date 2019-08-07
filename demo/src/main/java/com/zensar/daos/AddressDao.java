package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Address;

public interface AddressDao {
	void insert(Address address);
	void update(Address address);
	void delete(Address address);
	Address getById(int id);
	List<Address> getAll();
}
