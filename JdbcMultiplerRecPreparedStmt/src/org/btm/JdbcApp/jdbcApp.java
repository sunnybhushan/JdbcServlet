package org.btm.JdbcApp;

import java.sql.*;

public class jdbcApp {
	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		String inqr="insert into btm.student values(?,?,?)";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt=con.prepareStatement(inqr);
			System.out.println("Platform is  created");
			//SET THE VALUE BEFORE THE PLACE HOLDER EXECUTION//
			pstmt.setInt(1, 1);
			pstmt.setString(2, "Sunny");
			pstmt.setDouble(3, 68.05);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 2);
			pstmt.setString(2, "Ravi");
			pstmt.setDouble(3, 45.05);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 3);
			pstmt.setString(2, "RAkesh");
			pstmt.setDouble(3, 99.05);
			pstmt.executeUpdate();
			System.out.println("inserted successfully");	
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	finally 
	{
		if(pstmt!=null)
		{
			try
			{
				pstmt.close();
			} catch (SQLException e)
			{
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
	}
	}
	

}
