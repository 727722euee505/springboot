package com.example.day4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4.model.Fuelstation;
import com.example.day4.repositiory.petrolrep;

@Service
public class petrolservice {
@Autowired
public petrolrep then;

public Fuelstation savedetails(Fuelstation f)
{
	return then.save(f);
}
public List<Fuelstation> getDetails()
{
	return then.findAll();
}
}
