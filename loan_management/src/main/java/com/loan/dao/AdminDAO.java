package com.loan.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO {
	public static ResultSet retrieveCustomerDetails() throws SQLException 
	{

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
			
			// 2. Prepare statement
			myStmt = myConn.createStatement();
						
						// 3. Set the parameters
			myRs = myStmt.executeQuery("select * from customerloan");
						
						// 4. Execute SQL query
						
						return myRs;
		
	}
	public static void approve(int id) throws SQLException 
	{

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root" , "@Amrik99");
			
			// 2. Prepare statement
			myStmt = myConn.prepareStatement("update customerloan set Loan_Status = 'Approved' where custid=?");
						
						// 3. Set the parameters
			myStmt.setInt(1,id);
			int rows = myStmt.executeUpdate();
						
						// 4. Execute SQL query
						
		
	}
	public static void reject(int id) throws SQLException 
	{

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "@Amrik99");
			
			// 2. Prepare statement
			myStmt = myConn.prepareStatement("update customerloan set Loan_Status = 'Rejected' where custid=?");
						
						// 3. Set the parameters
			myStmt.setInt(1,id);
			int rows = myStmt.executeUpdate();
						
						// 4. Execute SQL query
						
		
	}

}
