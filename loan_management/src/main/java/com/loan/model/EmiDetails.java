package com.loan.model;

public class EmiDetails {
	
	
	public double amount;
	public String date;
	
	public EmiDetails( double amount, String date) {
		super();
		
		this.amount = amount;
		this.date = date;
	}
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	

}
