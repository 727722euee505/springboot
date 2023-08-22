package com.skcet.day5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class hotelmodel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int hotelid;
	@Column(name="Hotelname")
	private String name;
	private String located;
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocated() {
		return located;
	}
	public void setLocated(String located) {
		this.located = located;
	}
	
	

}