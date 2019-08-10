package com.zensar.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Address;
import com.zensar.entities.User;
import com.zensar.services.AddressService;

@RestController
@RequestMapping("/address")
public class AddressResource {
	@Autowired
	private AddressService addressService;
	
	@GetMapping
	public List<Address> getAllAddress() {
		return addressService.findAllAddresses();
	}
	
	@GetMapping("/{addressId}")	
	public Address getAddress(@PathVariable("addressId") int addressId) {
		return addressService.findById(addressId);
	}
	
	@PostMapping
	public String createAddress(@RequestParam("addressId") int addressId,@RequestParam("area") String area,@RequestParam("city") String city,@RequestParam("landmark") String landmark,@RequestParam("locality")  String locality){
	Address address=new Address(addressId,area,city,landmark,locality);
	addressService.create(address);
	return "Address "+addressId+" added successfully.";
	}
	
	@PutMapping
	public String editAddress(@RequestBody Address address) {
		addressService.edit(address);
		return "Address "+address.getAddressId()+" edited successfully.";
	}
	
	@DeleteMapping
	public String removeAddress(@RequestBody Address address) {
		addressService.remove(address);
		return " Address "+address.getAddressId()+" removed successfully.";
	}
	
	@GetMapping("/countAddress")
	public int getAddressesCount() {
		return addressService.findAllAddresses().size();
	}
}
