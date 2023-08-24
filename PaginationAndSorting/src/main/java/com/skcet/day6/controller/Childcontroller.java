package com.skcet.day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day6.model.Childmodel;
import com.skcet.day6.service.Childservice;

import jakarta.websocket.server.PathParam;

@RestController
public class Childcontroller {
	
	@Autowired
	Childservice hserv;
	@PostMapping("/savegift")
	public Childmodel savedetails(@RequestBody Childmodel fs)
	{
		return hserv.savedetails(fs);
	}
	@GetMapping("/get")
public List<Childmodel> getInfo()
{
	return hserv.getChild();
}
	@GetMapping("/pagination/{num}/{size}")
	public List<Childmodel> paginationEx(@PathVariable("num") int num,@PathVariable("size") int size)
	{
		return hserv.pagination(num,size);
	}
	//pagination and sorting
	@GetMapping("/paginationAndSort/{num}/{size}/{childName}")
	public List<Childmodel> paginationAndSort(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("childName")  String  childName)
	{
		return hserv.paginationAndSorting(num,size,childName);
	}
}
