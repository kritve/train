package com.programming.class1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCOperations {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Connection c1 = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String dbUrl ="jdbc:mysql://localhost:3306/sql_concepts?user=root&password=pass@word1";
		
		try {
			c1=DriverManager.getConnection(dbUrl);
			c1.setAutoCommit(false);
			stmt = c1.createStatement();
			int i=0;
			
//			String dropSQL = "DROP TABLE EMPLOYEES";
//			int i = stmt.executeUpdate(dropSQL);
//			if(i==0) System.out.println("EMployees table dropped");
//			else System.out.println("EMployees table doesn't exist");
			
			String createQuery = "create table if not exists employee(" +
			"id int not null, " +
			"first_name varchar(200), " +
			"last_name varchar(200), " +
			"designation varchar(200))";
			
			i=stmt.executeUpdate(createQuery);
			if(i==0) System.out.println("EMployees created successfully");
			else System.out.println("EMployees table not created");
			
			String insertQuery = "insert into employee values" + "(1,'a','b','c')";
			i = stmt.executeUpdate(insertQuery);
			if(i!=0)System.out.println("row inserted");
			else System.out.println("row not inserted");
			
			c1.commit();
			
			String selectQuery = "SELECT * FROM employee";
			rs=stmt.executeQuery(selectQuery);
			while(rs.next()) {
				System.out.println("ID: "+rs.getInt(1));
				System.out.println("First name: "+rs.getString(2));
				System.out.println("Last name: "+rs.getString(3));
				System.out.println("Designation: "+rs.getString(4));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
