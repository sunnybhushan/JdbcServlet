package org.btm.NameApp;

import java.sql.*;
import java.util.Scanner;

public class JdbcDemo
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select * from btm.student where name=?";
		Scanner sc=new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt=con.prepareStatement(qry);
			System.out.println("Enter the name you want to fetch the data");
			String nam=sc.nextLine();
			// SET THE VALUE PLACEHOLDER BEFORE EXECUTION//
			pstmt.setString(1, nam);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString(2);
				double per=rs.getDouble(3);
				System.out.println(id+" "+name+" "+per);
			}
			else
			{
				System.err.println("no such data is present on the name"+nam);
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if (rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			sc.close();
		}
	}
}
