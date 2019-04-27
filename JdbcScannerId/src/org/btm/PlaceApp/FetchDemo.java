package org.btm.PlaceApp;

import java.sql.*;
import java.util.Scanner;

public class FetchDemo
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pmt=null;
		ResultSet rs=null;
		String qry="select * from btm.student where id=?";
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter Id?");
		int id=sc.nextInt();
		sc.close();
		try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
				pmt=con.prepareStatement(qry);
				//SET THE VALUE FOR PLACEHOLDER BEFORE EXECUTION//
				pmt.setInt(1, id);
				rs=pmt.executeQuery();
			if(rs.next())
			{
				String name=rs.getString(2);
				double perc=rs.getDouble(3);
				System.out.println(name+" "+perc);
			}
			else //VALIDATION//
			{
				System.err.println("No Data Found for Id"+id);
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
		if (pmt!=null)
		{
			try {
				pmt.close();
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
	}
	}
}
