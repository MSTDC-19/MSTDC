package com.zensar.mtdc.service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Places {
	@Id
	private int id;
	private String name;
	private String description;
	private String PlaceType;
	
	
	public Places(){
		
	}
	
	public Places(int id, String name, String description, String placeType) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		PlaceType = placeType;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPlaceType() {
		return PlaceType;
	}
	public void setPlaceType(String placeType) {
		PlaceType = placeType;
	}

	@Override
	public String toString() {
		return "Places [id=" + id + ", name=" + name + ", description=" + description + ", PlaceType=" + PlaceType
				+ "]";
	}
	
	
	
}
