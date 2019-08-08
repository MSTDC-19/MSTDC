package com.zensar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.BillDao;
import com.zensar.entities.Bill;
@Service
@Transactional
public class BillServiceImpl implements BillService {

	@Autowired
	private BillDao billDao;
	
	public void create(Bill bill) {
		billDao.insert(bill);

	}
	
	public void edit(Bill bill) {
		Bill dbBill=billDao.getById(bill.getBillId());
		if(dbBill!=null) {
			dbBill.setBooking(bill.getBooking());
			dbBill.setHotel(bill.getHotel());
			dbBill.setUser(bill.getUser());
			dbBill.setTotalAmount(bill.getTotalAmount());
			
			billDao.update(dbBill);
		}

	}

	
	public void remove(Bill bill) {
		if(bill!=null) {
			billDao.delete(bill);
		}
		else {
			System.out.println("Enter correct details");
		}

	}

	
	public Bill findById(int billId) {
	
		return billDao.getById(billId);
	}

	
	public List<Bill> findAllBills() {
	
		return billDao.getAll();
	}

}
