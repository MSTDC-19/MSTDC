package com.zensar.services;

import java.util.List;

import com.zensar.entities.Address;

public interface AddressService {
	void create(Address address);
	void edit(Address address);
	void remove(Address address);
	Address findById(int id);
	List<Address> findAllAddresses();
}
