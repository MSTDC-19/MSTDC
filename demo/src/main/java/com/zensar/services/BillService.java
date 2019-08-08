package com.zensar.services;

import java.util.List;

import com.zensar.entities.Bill;

public interface BillService {
	void create(Bill bill);
	void edit(Bill bill);
	void remove(Bill bill);
	Bill findById(int billId);
	List<Bill> findAllBills();
}
