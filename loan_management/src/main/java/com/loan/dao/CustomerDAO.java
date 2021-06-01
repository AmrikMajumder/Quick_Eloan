package com.loan.dao;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerDAO {
	
	static String dol;
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
	
	public static ResultSet getCustomerDetails(int pid)throws SQLException
	{
		int username1=pid;

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
			
			// 2. Prepare statement
						myStmt = myConn.prepareStatement("select * from customerloan where custid = ?");
						
						// 3. Set the parameters
						myStmt.setLong(1, username1);
						
						// 4. Execute SQL query
						myRs = myStmt.executeQuery();
						
						return myRs;
	}
	
	public static ResultSet validateLogin(String user,String pass) throws SQLException 
	{
		String username1=user;
		String password1=pass;

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
			
			// 2. Prepare statement
						myStmt = myConn.prepareStatement("select * from customerlogin where name = ? and password = ?");
						
						// 3. Set the parameters
						myStmt.setString(1, username1);
						myStmt.setString(2, password1);
						
						// 4. Execute SQL query
						myRs = myStmt.executeQuery();
						
						return myRs;
		
	}
	public static ResultSet getLoanStatus(String user) throws SQLException 
	{
		String username1=user;

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
			
			// 2. Prepare statement
						myStmt = myConn.prepareStatement("select Loan_Status from customerloan where name = ?");
						
						// 3. Set the parameters
						myStmt.setString(1, username1);
						
						// 4. Execute SQL query
						myRs = myStmt.executeQuery();
						
						return myRs;
		
	}
	public static ResultSet getLoanDetails(int custid) throws SQLException 
	{
		//String username1=user;

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
			
			// 2. Prepare statement
						myStmt = myConn.prepareStatement("select * from customerloan where custid = ?");
						
						// 3. Set the parameters
						myStmt.setInt(1, custid);
						
						// 4. Execute SQL query
						myRs = myStmt.executeQuery();
						
						return myRs;
		
	}
	
	public static ResultSet getLoanID(String name)throws SQLException
	{
		String username1=name;

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
			
			// 2. Prepare statement
						myStmt = myConn.prepareStatement("select custid from customerloan where name = ?");
						
						// 3. Set the parameters
						myStmt.setString(1, username1);
						
						// 4. Execute SQL query
						myRs = myStmt.executeQuery();
						
						return myRs;
	}
	
	
	
	public static void addNewCust(String name, String password) throws SQLException
	{
		Connection myConn2 = null;
		PreparedStatement myStmt2 = null;
		
			// 1. Get a connection to database
			myConn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
			
			// 2. Prepare statement
						myStmt2 = myConn2.prepareStatement(
								"INSERT INTO `customerlogin` " +
										"(`name`,`password`) " + 
										"VALUES " + 
										"(?,?)");
						myStmt2.setString(1, name);
						myStmt2.setString(2, password);
						
						myStmt2.executeUpdate();
		
	}
	
	public static void addNewCust(String name, String gender, String dob, long phone, String e_mail, String loan_type, 
			int tenure, int loan_amount, int annual_income, String dol, long aadhaar, String pan) throws SQLException
	{

			Connection myConn2 = null;
			PreparedStatement myStmt2 = null;
			
				// 1. Get a connection to database
				myConn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
				
				// 2. Prepare statement
							myStmt2 = myConn2.prepareStatement(
									"INSERT INTO `customerloan` " +
											"(`name`,`Gender`,`DOB`,`phone_no`,`e_mail`,`Loan_type`,`Tenure`,`Loan_Amount`,`Annual_Income`,`Loan_Status`,`Loan_Date`,`Aadhaar`,`Pan`) " + 
											"VALUES " + 
											"(?,?,?,?,?,?,?,?,?,?,?,?,?)");
							myStmt2.setString(1, name);
							myStmt2.setString(2, gender);
							myStmt2.setString(3, dob);
							myStmt2.setDouble(4, phone);
							myStmt2.setString(5, e_mail);
							myStmt2.setString(6, loan_type);
							myStmt2.setInt(7, tenure);
							myStmt2.setInt(8, loan_amount);
							myStmt2.setInt(9, annual_income);
							myStmt2.setString(10, "Not Approved");
							myStmt2.setString(11, dol);
							myStmt2.setLong(12, aadhaar);
							myStmt2.setString(13, pan);
							myStmt2.executeUpdate();
							
	}
	
	/*public static void addNewAcc(String name, double phone, int balance, String city, int annual_income, String mail, String password) throws SQLException
	{
		Connection myConn2 = null;
		PreparedStatement myStmt2 = null;
		
			// 1. Get a connection to database
			myConn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "megha");
			
			// 2. Prepare statement
						myStmt2 = myConn2.prepareStatement("INSERT INTO accdetails(name, password, city, phone, mail, annual_income,balance)VALUES (?,?,?,?,?,?,?)");
						myStmt2.setString(1, name);
						myStmt2.setString(2, password);
						myStmt2.setString(3, city);
						myStmt2.setDouble(4, phone);
						myStmt2.setString(5, mail);
						myStmt2.setInt(6, annual_income);
						myStmt2.setInt(7, balance);
						
						myStmt2.executeUpdate();
		
	}*/
	
	public static void updateCust(int id,String name, String dob, long phone, String mail, String loan_type, int tenure, int loan_amount, int annual_income, long aadhaar, String pan ) throws SQLException
	{

			Connection myConn2 = null;
			//PreparedStatement myStmt2 = null;
			
				// 1. Get a connection to database
				myConn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
				
				// 2. Prepare statement
				PreparedStatement update = myConn2.prepareStatement(
									"UPDATE customerloan SET name=? ,dob=? ,phone_no=? ,e_mail=? ,loan_type=?,tenure=?, loan_amount=?, annual_income=? ,loan_status=?,aadhaar=?,pan=? WHERE custid=?" );
											//"(`name`,`phone_no`,`Loan_type`,`Loan_Amount`,`Annual_Income`) " + 
											//"VALUES " + 
											//"(?,?,?,?,?)");
						
				update.setString(1, name);
				update.setString(2, dob);
				update.setDouble(3, phone);
				update.setString(4, mail);
				update.setString(5, loan_type);
				update.setInt(6, tenure);
				update.setInt(7, loan_amount);
				update.setInt(8, annual_income);
				update.setString(9, "not approved");
				update.setLong(10, aadhaar);
				update.setString(11, pan);
				update.setLong(12, id);
						
				update.executeUpdate();
							
	}
	
	public static boolean validateLoan(int cust)throws SQLException
	{
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		String stat=null;
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
			
			// 2. Prepare statement
						myStmt = myConn.prepareStatement("select Loan_Status from customerloan where custid = ?");
						myStmt.setInt(1, cust);
						myRs=myStmt.executeQuery();
				while(myRs.next())
				{
					stat=myRs.getString(1);
				}
				if(stat.equalsIgnoreCase("Approved"))
					return true;
				else
					return false;
	}

	public static ResultSet getData(int cust)throws SQLException {
		// TODO Auto-generated method stub
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
		
		// 2. Prepare statement
					myStmt = myConn.prepareStatement("select amount,date from emi where id = ?");
					myStmt.setInt(1, cust);
					myRs=myStmt.executeQuery();
					return myRs;
	}

	public static double getRemaining(int cust, double amt)throws SQLException {
		// TODO Auto-generated method stub
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		double sum=0.0;
		myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
		
		// 2. Prepare statement
					myStmt = myConn.prepareStatement("select SUM(amount) from emi where id = ?");
					myStmt.setInt(1, cust);
					myRs=myStmt.executeQuery();
					while(myRs.next()) {
					 sum=myRs.getDouble(1);
					}
					return sum;
		
	}
	public static void addData(int cust,double amt)throws SQLException{
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
		dol = sdf.format(new Date());
		// 2. Prepare statement
					myStmt = myConn.prepareStatement("insert into emi values(?,?,?)");
					myStmt.setInt(1, cust);
					myStmt.setDouble(2, amt);
					myStmt.setString(3, dol);
					myStmt.executeUpdate();
	}

}
