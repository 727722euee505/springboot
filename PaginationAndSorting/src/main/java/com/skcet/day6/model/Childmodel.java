package com.skcet.day6.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Childdetails")
public class Childmodel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sapCode;
	@Column(name="Childname")
	private String childName;
	private String address;

	public int getSapCode() {
	return sapCode;
	}
	public void setSapCode(int sapCode) {
	this.sapCode = sapCode;
	}
	public String getChildName() {
	return childName;
	}
	public void setChildName(String childName) {
	this.childName = childName;
	}
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
	this.address = address;
}
}