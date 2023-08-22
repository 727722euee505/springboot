package com.skcet.day5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day5.model.hotelmodel;
import com.skcet.day5.service.hotelservice;

@RestController
public class hotelcontroller {
	@Autowired
	public hotelservice mm;
	@PostMapping("/posthotel")
	public  String hotelmodel (@RequestBody hotelmodel h)
	{
		mm.saveDetails(h);
		return "Data saved";
	}
	@GetMapping("/gethotel")
	public List<hotelmodel>getrithick()
	{
		return mm.getDetails();
	}
	@PutMapping("/updatehotel")
	public hotelmodel updaterithick(@RequestBody hotelmodel ha) 
	{
		return mm.updateDetails(ha);
	}
	//delete by path variable
	@DeleteMapping("/deletehotel/{id}")
	public String removerithick(@PathVariable("id") int hid)
	{
		mm.deleteDetails(hid);
		return "Hotel with Id"+hid+"is deleted";
	}
	//delete mapping using request parm
	@DeleteMapping("/byrepparm")
	public String removedByRequestpam(@RequestParam("id") int id)
	{
		mm.deleteDetails(id);
		return "Hotel with Id "+id+" is deleted";
	}
	//getuserById
	@GetMapping("/users/{userId}")
	public ResponseEntity<?>getUserId(@PathVariable int userId)
	{
	Optional<hotelmodel>hotel=mm.getUserId(userId);
	if(hotel!=null) {
		return ResponseEntity.ok(hotel); //return the users data if available
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with ID");
		
	}
	@DeleteMapping("/deletehotelif/{id}")
	public ResponseEntity<String>deletehotelinfo(@PathVariable int id)
	{
		boolean deleted=mm.deletehotelinfo(id);
		if(deleted)
		{
			return ResponseEntity.ok("Hotel with ID "+ id +" deleted successfully");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hotel with ID "+ id +" not found");
		}
	}
	
}