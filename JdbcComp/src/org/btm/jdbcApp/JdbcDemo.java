package org.btm.jdbcApp;
import java.sql.*;
public class JdbcDemo
{
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class is loaded & Registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("Connection Establish with DBserver");
			stmt=con.createStatement();
			System.out.println("Platform Created");
		} catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			if(stmt!=null)
			{
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.println("closed costly resource");
		}
		
	}
}
