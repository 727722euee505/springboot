package com.skcet.day5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.day5.model.hotelmodel;
import com.skcet.day5.repository.hotelrepo;

@Service
public class hotelservice {
	@Autowired
	public hotelrepo hp;
	//post the data
	public hotelmodel saveDetails(hotelmodel hm)
	{
		return hp.save(hm);
	}
	//get the data
	public List<hotelmodel>getDetails()
	{
		return hp.findAll();
	}
	//update the data
	public hotelmodel updateDetails(hotelmodel hc)
	{
		return hp.saveAndFlush(hc);
	} 
	//delete if id is present
	public boolean deletehotelinfo(int hotelId)
	{
		if(hp.existsById(hotelId))
		{
			hp.deleteById(hotelId);
			return true;
		}
		return false;
	}
	//delete the data
	public void deleteDetails(int id)
	{
		System.out.println("DEleted");
		hp.deleteById(id);
	}
	//get the data
   public Optional<hotelmodel> getUserId(int userId)
   {
	   Optional<hotelmodel>hotel=hp.findById(userId);
	   if(hotel.isPresent())
	   {
		   return hotel;
	   }
	   return null;
   }
}