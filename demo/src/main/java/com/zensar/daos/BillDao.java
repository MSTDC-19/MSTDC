package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Bill;

public interface BillDao {
	void insert(Bill bill);
	void update(Bill bill);
	void delete(Bill bill);
	Bill getById(int billId);
	List<Bill> getAll();
}
