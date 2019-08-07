package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Bill;
@Repository
public class BillDaoImpl implements BillDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;
	public void insert(Bill bill) {
		hibernatetemplate.save(bill);

	}

	
	public void update(Bill bill) {
		hibernatetemplate.update(bill);

	}

	
	public void delete(Bill bill) {
		hibernatetemplate.delete(bill);

	}

	
	public Bill getById(int billId) {
	
		return hibernatetemplate.get(Bill.class, billId);
	}

	
	public List<Bill> getAll() {
	
		return hibernatetemplate.loadAll(Bill.class);
	}

}
