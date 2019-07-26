package com.zensar.mtdc.test;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zensar.mtdc.service.Admin;
import com.zensar.mtdc.service.Bookings;
import com.zensar.mtdc.service.Guests;
import com.zensar.mtdc.service.Hotel;
import com.zensar.mtdc.service.Places;
import com.zensar.mtdc.service.Room;
import com.zensar.mtdc.service.TotalBill;
import com.zensar.mtdc.service.User;
import com.zensar.mtdc.service.UserType;

public class Test {
	public static void main(String[] args) {
		
		Date date;
		UserType usertype=new UserType(111,"user");
		User user=new User(0171,"xyz","xyz@abc.com","useriam","male",usertype);
		Hotel hotel=new Hotel(21,"PrimRose","3 star","Luxury");
		Room room=new Room(208, "AC", "Single", 2000);
		Bookings booking=new Bookings(0101,"xyz",user,new Date(),new Date(),"booked",hotel,room,1);
		
		
		Guests guest=new Guests(111,"pqr",21, 0101);
	
		
		
		//Places place=new Places(41101, "Pune","IT HUB","City");
		TotalBill totalbill=new TotalBill(0011, booking, room, user, hotel, 3000);
		
		Admin admin=new Admin(121,"ABC","iamadmin");
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		
		s.save(user);
		s.save(booking);
		s.save(guest);
		s.save(hotel);
		//s.save(place);
		s.save(room);
		s.save(usertype);
		s.save(totalbill);
		s.save(admin);
		s.getTransaction().commit();
		s.close();
		
		}
	}




