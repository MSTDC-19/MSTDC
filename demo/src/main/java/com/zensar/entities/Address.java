package com.zensar.entities;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Address {
	@Id
	private int id;
	private String area;
	private String city;
	private String landmark;
	private String locality;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Address(int id, String area, String city, String landmark, String locality) {
		super();
		this.id = id;
		this.area = area;
		this.city = city;
		this.landmark = landmark;
		this.locality = locality;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", area=" + area + ", city=" + city + ", landmark=" + landmark + ", locality="
				+ locality + "]";
	}

	
	
	
	
	
}
