package com.zensar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.AddressDao;
import com.zensar.entities.Address;
@Service
@Transactional
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressDao addressDao;
	
	public void create(Address address) {
		addressDao.insert(address);

	}

	
	public void edit(Address address) {
		Address dbaddress=addressDao.getById(address.getAddressId());
		if(dbaddress!=null) {
			dbaddress.setArea(address.getArea());
			dbaddress.setCity(address.getCity());
			dbaddress.setLandmark(address.getLandmark());
			dbaddress.setLocality(address.getLocality());
			addressDao.update(dbaddress);
		}
	
	}

	
	public void remove(Address address) {
		if(address!=null) {
			addressDao.delete(address);
		}
		else {
			System.out.println("No such Address!");
		}

	}
	

	
	public Address findById(int addressId) {
		
		return addressDao.getById(addressId);
	}

	
	public List<Address> findAllAddresses() {
	
		return addressDao.getAll();
	}

}
