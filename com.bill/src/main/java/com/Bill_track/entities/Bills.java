package com.Bill_track.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private double main_expenses;
	
	private double shared_expenses;
	
	private double total_expense;
	
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
	public double getMain_expenses() {
		return main_expenses;
	}
	public void setMain_expenses(double main_expenses) {
		this.main_expenses = main_expenses;
	}
	public double getShared_expenses() {
		return shared_expenses;
	}
	public void setShared_expenses(double shared_expenses) {
		this.shared_expenses = shared_expenses;
	}
	public double getTotal_expense() {
		return total_expense;
	}
	public void setTotal_expense(double total_expense) {
		this.total_expense = total_expense;
	}
	public Bills(int id, String name, double main_expenses, double shared_expenses, double total_expense) {
		super();
		this.id = id;
		this.name = name;
		this.main_expenses = main_expenses;
		this.shared_expenses = shared_expenses;
		this.total_expense = total_expense;
	}
	public Bills() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bills [id=" + id + ", name=" + name + ", main_expenses=" + main_expenses + ", shared_expenses="
				+ shared_expenses + ", total_expense=" + total_expense + "]";
	}
	
	
	
	
	
	
	
	

}
