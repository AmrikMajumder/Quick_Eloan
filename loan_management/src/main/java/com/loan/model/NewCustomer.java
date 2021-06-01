package com.loan.model;

public class NewCustomer {
	int accno;
	String name;
	double phone_no;
	int mail;
	int annual_income;
	String balance;
	String city;
	
	
	public NewCustomer(int accno, String name, double phone_no, int mail, int annual_income, String balance,
			String city) {
		super();
		this.accno = accno;
		this.name = name;
		this.phone_no = phone_no;
		this.mail = mail;
		this.annual_income = annual_income;
		this.balance = balance;
		this.city = city;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(double phone_no) {
		this.phone_no = phone_no;
	}
	public int getMail() {
		return mail;
	}
	public void setMail(int mail) {
		this.mail = mail;
	}
	public int getAnnual_income() {
		return annual_income;
	}
	public void setAnnual_income(int annual_income) {
		this.annual_income = annual_income;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
