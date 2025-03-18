package com.programming.class1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	
	public static void main(String[] args) throws SQLException {
		
		Connection c1 = null;
		Connection c2 = null;
		Connection c3 = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl ="jdbc:mysql://localhost:3306/sql_concepts?user=root&password=pass@word1";
			
			c1 = DriverManager.getConnection(dbUrl);
			
			if(c1 != null) {
				System.out.println("Connected with c1");
			}
			
			String dbUrl2 = "jdbc:mysql://localhost:3306/sql_concepts";
			String u = "root";
			String p = "pass@word1";
			
			c2= DriverManager.getConnection(dbUrl2, u, p);
				
			if(c2 != null) {
				System.out.println("Connected with c2");
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(c1 != null && !c1.isClosed()) {
				c1.close();
			} if(c2 != null && !c2.isClosed()) {
				c2.close();
			}
		}
		
	}

}
