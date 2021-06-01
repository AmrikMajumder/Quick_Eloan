package com.loan.service;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import org.springframework.stereotype.Component;

import com.loan.dao.AdminDAO;
import com.loan.dao.CustomerDAO;
import com.loan.model.CustomerDetails;
import com.loan.model.EmiDetails;

@Component
public class CustomerService 
{
	public String name1;
	public String loan_status;
	public long phone;
	public String loan_type;
	public int tenure;
	public int amount;
	public int income;
	public int id;
	public double emi;
	public double rate;
	public double x; 
	String dol;
	public String l_d;
	public String dob;
	public String pan;
	public long aadhaar;
	public String mail;
	public double rem;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
	
	
	public boolean validateLogin(String name, String pass) throws SQLException 
	{

			ResultSet myRs = null;
			myRs=CustomerDAO.validateLogin(name,pass);
			int cou=0;
			while(myRs.next())
			{
				name1=myRs.getString(2);
				cou++;
			}
			
			if(cou!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	public void retrieveCustomerDetailsCust(int custid) throws SQLException
	{
		
		ResultSet myRs = null;
		myRs=CustomerDAO.getLoanDetails(custid);
		int cou=0;
		while(myRs.next())
		{   id=myRs.getInt(1);
		    name1=myRs.getString(2);
		    phone=myRs.getLong(5);
		    loan_type = myRs.getString(7);
		    tenure = myRs.getInt(8);
		    amount=myRs.getInt(9);
		    income=myRs.getInt(10);
			loan_status=myRs.getString(11);
			l_d=myRs.getString(12);
			
			cou++;
		}
		if(loan_type.equalsIgnoreCase("Student Loan"))
		{
			rate = 7;
			x=Math.pow(1+0.07,(tenure*12));
			//emi=P*r*(1+r)^n/((1+r)^n-1)
			emi= (amount*0.07*x)/(x-1);
		}
		else if(loan_type.equalsIgnoreCase("Home Loan"))
		{
			rate = 5;
			x=Math.pow(1+0.05,(tenure*12));
			//emi=P*0.05*(1+0.05)^n/((1+0.05)^n-1)
			emi= (amount*0.05*x)/(x-1);
		}
		else if(loan_type.equalsIgnoreCase("Car Loan"))
		{
			rate = 8;
			x=Math.pow(1+ 0.08,(tenure*12));
			//emi=P*r*(1+r)^n/((1+r)^n-1)
			emi= (amount* 0.08*x)/(x-1);
		}
		else if(loan_type.equalsIgnoreCase("Personal Loan"))
		{
			rate = 9;
			x=Math.pow(1+0.09,(tenure*12));
			//emi=P*r*(1+r)^n/((1+r)^n-1)
			emi= (amount*0.09*x)/(x-1);
		}
	}
	
	public void retrieveCustomerId(String name)throws SQLException
	{
		ResultSet myRs = null;
		myRs=CustomerDAO.getLoanID(name);
		int cou=0;
		while(myRs.next())
		{  
			id=myRs.getInt(1);
			cou++;
		}
	}
		
	public void getCustomerDetails(int pid) throws SQLException
	{
		ResultSet myRs = null;
		myRs=CustomerDAO.getCustomerDetails(pid);
		int cou=0;
		while(myRs.next())
		{   id=myRs.getInt(1);
		    name1=myRs.getString(2);
		    dob=myRs.getString(4);
		    phone=myRs.getLong(5);
		    mail=myRs.getString(6);
		    loan_type = myRs.getString(7);
		    tenure = myRs.getInt(8);
		    amount=myRs.getInt(9);
		    income=myRs.getInt(10);
			loan_status=myRs.getString(11);
			l_d=myRs.getString(12);
			aadhaar=myRs.getLong(13);
			pan=myRs.getString(14);
			cou++;
		}
		}
	
	public void newRegister(String name, String gender, String dob, long phone, String e_mail, String loan_type, 
			int tenure, int loan_amount, int annual_income, long aadhaar, String pan) throws SQLException
	{
		dol = sdf.format(new Date());
		CustomerDAO.addNewCust(name,gender,dob,phone,e_mail,loan_type,tenure,loan_amount,annual_income,dol,aadhaar,pan);
	}
	public void newCust(String name, String password) throws SQLException
	{
		CustomerDAO.addNewCust(name,password);
    }
	
	/*public void newAcc(String name, long phone, int balance, String city, int annual_income, String mail, String password) throws SQLException
	{
		CustomerDAO.addNewAcc(name, phone, balance, city, annual_income, mail, password);
	}*/
	public boolean validateIncome(int income)
	{
		if(income>=200000)
		{
			return true;
		}
		return false;
	}
	
	public boolean validateEmail(String str)
	{
		if(str.contains("@") && str.contains(".com"))
		{
			return true;
		}
		else
			return false;
	}
	public boolean validateDOB(String str)
	{
		String[] arr=str.split("-");
		int dob = Integer.parseInt(arr[0]);
		int diff=2021-dob;
		if(diff>18)
		{
			return true;
			}
			else
				return false;
		
	}
	public boolean validatePhone(long l)
	{
		String str=String.valueOf(l);
		if((str.charAt(0)=='7' || str.charAt(0)=='8' || str.charAt(0)=='9') && str.length()==10)
		{
			return true;
		}
		else
			return false;
		
	}

	
	public void oldRegister(int id, String name, String dob, long phone, String mail, String loan_type,
			int tenure, int loan_amount, int annual_income, long aadhaar, String pan) throws SQLException {
		
		CustomerDAO.updateCust(id,name, dob, phone, mail, loan_type, tenure, loan_amount, annual_income, aadhaar, pan);
		
	}
	public ArrayList<EmiDetails> getStatus(int cust, double amt,double emiValue) throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<EmiDetails> list=new ArrayList<EmiDetails>();
		ResultSet rs=CustomerDAO.getData(cust);
		double sum=CustomerDAO.getRemaining(cust,amt);
		rem=(emiValue*12*tenure)-sum;
		while(rs.next())
		{
			double amount=rs.getDouble(1);
			String de=rs.getString(2);
			list.add(new EmiDetails(amount,de));
		}
		return list;
		
	}
	
	
	
	
	
}
