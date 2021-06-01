package com.loan.service;

import java.util.Set;
import java.util.TreeSet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;

import com.loan.dao.AdminDAO;
import com.loan.model.CustomerDetails;

import org.springframework.stereotype.Component;

@Component
public class AdminService {

	public int id;
	public String name;
	public String gender;
	public String dob;
	public long phone;
	public String e_mail;
	public String loan_type;
	public int tenure;
	public int amount;
	public int income;
	public String loan_status;
	public long aadhaar;
	public String pan;
	
	
	public boolean validateUser(String userid, String password) {
		// in28minutes, dummy
		return userid.equalsIgnoreCase("admin")
				&& password.equalsIgnoreCase("12345");
	}
	private static Set<CustomerDetails> cust_details = new LinkedHashSet<CustomerDetails>();
	//private static int todoCount = 3;

	

	public Set<CustomerDetails> retrieveCustDetails() {
		Set<CustomerDetails> filteredTodos = new LinkedHashSet<CustomerDetails>();
		for (CustomerDetails cust : cust_details) {
			
				filteredTodos.add(cust);
		}
		return filteredTodos;
	}
	public void retrieveCustomerDetails() throws SQLException 
	{
		cust_details.clear();
			ResultSet myRs = null;
			myRs=AdminDAO.retrieveCustomerDetails();
			int cou=0;
			while(myRs.next())
			{
				id = myRs.getInt(1);
				name = myRs.getString(2);
				phone = myRs.getLong(5);
				e_mail = myRs.getString(6);
				loan_type = myRs.getString(7);
				tenure = myRs.getInt(8);
				amount = myRs.getInt(9);
				income = myRs.getInt(10);
				loan_status = myRs.getString(11);
				aadhaar = myRs.getLong(13);
				pan = myRs.getString(14);
				CustomerDetails cust_ob = new CustomerDetails(id,name,gender,dob,phone,e_mail,loan_type,tenure,amount,income,loan_status,aadhaar,pan);
				cust_details.add(cust_ob);
				cou++;
			}
			
	}
			public void approve(int id) throws SQLException 
			{
				cust_details.clear();
					AdminDAO.approve(id);
					
	}
			public void reject(int id) throws SQLException 
			{
				cust_details.clear();
					AdminDAO.reject(id);
					
	}

}