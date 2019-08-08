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
import com.zensar.entities.Bill;
import com.zensar.entities.Bookings;
import com.zensar.entities.Hotel;
import com.zensar.entities.User;
import com.zensar.services.BillService;

@RestController
@RequestMapping("/bills")
public class BillResource {
	@Autowired
	private BillService billService;
	
	@GetMapping
	public List<Bill> getAllBill() {
		return billService.findAllBills();
	}
	
	@GetMapping("/{billId}")	
	public Bill getBill(@PathVariable("billId") int billId) {
		return billService.findById(billId);
	}
	
	@PostMapping
	public String createBill(@RequestParam("billId") int billId,@RequestParam("user") User user,@RequestParam("hotel") Hotel hotel,@RequestParam("booking") Bookings bookings,@RequestParam("totalamount") float totalamount){
	Bill bill=new Bill(billId,user,hotel,bookings,totalamount);
	billService.create(bill);
	return "Booking "+billId+" added .";
	}
	
	@PutMapping
	public String editBill(@RequestBody Bill bill) {
		billService.edit(bill);
		return "Bill "+bill.getBillId()+" edited successfully.";
	}
	
	@DeleteMapping
	public String removeBill(@RequestBody Bill bill) {
		billService.remove(bill);
		return " Bill "+bill.getBillId()+" removed successfully.";
	}
	
	@GetMapping("/countBill")
	public int getBillsCount() {
		return billService.findAllBills().size();
	}
}
