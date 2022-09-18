package com.Bill_track.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bill_track.entities.Bills;
import com.Bill_track.services.Service;

@RestController
public class Maincontroller
{

	@Autowired
	private Service ser;
	
	
	
	public Maincontroller(Service ser) {
		super();
		this.ser = ser;
	}

	@PostMapping("/save")
	public Bills save(Bills bill)
	{
		Bills b1= this.ser.create(bill);
		return b1;
	}
	
	@DeleteMapping("/delete/{id}")
	public void del(@PathVariable int id)
	{
		this.ser.delbyid(id);
		
	}
	@PutMapping("/update/{id}")
	public Bills update(@PathVariable int id, @RequestBody Bills bill)
	{
		return this.update(id, bill);
	}
	
	@GetMapping("/getall")
	public List<Bills> getall(Bills bill)
	{
		return this.ser.getall();
		
	}
	
}
