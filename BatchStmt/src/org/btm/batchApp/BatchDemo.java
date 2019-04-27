package org.btm.batchApp;

import java.sql.*;

public class BatchDemo
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		String inqry="insert into btm.demo values(4,'sunny','software',75.33)";
		String upqry="update btm.student name='sunny' where id=2";
		String delqry="delete from btm.demo where id=1";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			stmt=con.createStatement();	
			stmt.addBatch(inqry);
			stmt.addBatch(upqry);
			stmt.addBatch(delqry);
			int arr[]=stmt.executeBatch();
			for (int i : arr) {
				System.out.println(i);
			}
			
		} catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	finally
	{
		if(stmt!=null)
		{
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	}
}








