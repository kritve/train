package com.programming.class1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

class DBConnection {
	private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/sql_concepts";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "pass@word1";
	
	public static Connection getConnection() throws SQLException {
		Connection conn=null;
		
		try {
			Class.forName(DB_DRIVER_CLASS);
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return conn;
	}
}

public class CallableStatementAPI {
	
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		CallableStatement cstmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id (int): ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter role: ");
		String role = sc.nextLine();
		System.out.println("Enter city: ");
		String city = sc.nextLine();
		System.out.println("Enter country: ");
		String country = sc.nextLine();
		
		conn = DBConnection.getConnection();
		try {
			cstmt = conn.prepareCall("(call insertEMployeeRecord(?,?,?,?,?,?))");
			cstmt.setInt(1, id);
			cstmt.setString(2, name);
			cstmt.setString(3, role);
			cstmt.setString(4, city);
			cstmt.setString(5, country);
			cstmt.registerOutParameter(6, java.sql.Types.VARCHAR);
			cstmt.executeUpdate();
			System.out.println("Record saved successfully: " + cstmt.getString(6));
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				cstmt.close();
				conn.close();
				sc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

}
