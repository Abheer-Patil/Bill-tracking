package com.Bill_track.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Bill_track.entities.Bills;
import com.Bill_track.repo.Myrepo;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	private Myrepo repo;
	
	public List<Bills> getall()
	{
		return this.repo.findAll();
	}
	
	public Bills getbyid(int id )
	{
		return this.repo.findById(id).orElseThrow(()-> new RuntimeException()) ;
		
	}
	
	public Bills create(Bills bill)
	{
		Bills b1=this.repo.save(bill);
		b1.setTotal_expense(b1.getMain_expenses()+b1.getShared_expenses());
		return b1 ;
	}
	
	
	public void delbyid(int id )
	{
		
		this.repo.deleteById(id) ;	
		
	}
	
	public Bills update(Bills bill, int id)
	{
		Bills b1=this.repo.findById(id).orElseThrow(()-> new RuntimeException()) ;
		b1.setName(bill.getName());
		b1.setShared_expenses(bill.getShared_expenses());
		b1.setMain_expenses(bill.getMain_expenses());
		b1.setTotal_expense(b1.getMain_expenses()+b1.getShared_expenses());
		return b1;
		
	}
	
}
