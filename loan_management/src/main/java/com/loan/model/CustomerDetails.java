package com.loan.model;

import java.util.Date;

import javax.xml.crypto.Data;

public class CustomerDetails 
{
	
	int id;
	String name;
	String gender;
	long phone_no;
	String e_mail;
	String loan_type;
	int loan_amount;
	int annual_income;
	String loan_status;
	int tenure;
	long aadhaar;
	String pan;
	String dob;
	

	
	public CustomerDetails(int id, String name, String gender, String dob, long phone_no, String e_mail, String loan_type,
			int loan_amount, int annual_income, int tenure, String loan_status, long aadhaar, String pan) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phone_no = phone_no;
		this.e_mail = e_mail;
		this.loan_type = loan_type;
		this.loan_amount = loan_amount;
		this.annual_income = annual_income;
		this.loan_status = loan_status;
		this.tenure = tenure;
		this.aadhaar = aadhaar;
		this.pan = pan;
		this.dob = dob;
		
	}
	
	
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}


	public long getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(long aadhaar) {
		this.aadhaar = aadhaar;
	}

	
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}

	
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	
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
	
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	
	public int getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}
	
	public int getAnnual_income() {
		return annual_income;
	}
	public void setAnnual_income(int annual_income) {
		this.annual_income = annual_income;
	}
	
	public String getLoan_status() {
		return loan_status;
	}
	public void setLoan_status(String loan_status) {
		this.loan_status = loan_status;
	}
}
