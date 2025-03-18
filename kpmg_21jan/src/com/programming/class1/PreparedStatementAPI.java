package com.programming.class1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementAPI {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)  {
		
		Connection c1 = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String dbUrl ="jdbc:mysql://localhost:3306/sql_concepts?user=root&password=pass@word1";
		
		try {
			c1 = DriverManager.getConnection(dbUrl);
			String sql = "update employee set first_name=? where id=?";
			pstmt = c1.prepareStatement(sql);
			pstmt.setString(1, "PQR");
			pstmt.setInt(2,1);
			int rows = pstmt.executeUpdate();
			String selectSQL = "select * from employee where id=?";
			pstmt = c1.prepareStatement(selectSQL);
			pstmt.setInt(1,1);
			rs = pstmt.executeQuery();
			System.out.println("id \t First name  \t Last name \t  Designation");
			System.out.println("========================================");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(null!=c1) {
				try {
					rs.close();
					pstmt.close();
					c1.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
