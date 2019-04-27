package org.btm.jdbcApp;

import java.io.ObjectInputStream.GetField;
import java.sql.*;


public class JdbcDemo {
public static void main(String[] args)
{
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	String qry="select * from btm.student";
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
		pstmt=con.prepareStatement("jdbc:mysql://localhost:3306?user=root&password=admin");
		rs=pstmt.executeQuery(qry);
		if(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			double perc=rs.getDouble(3);
			System.out.println(id+" "+name+" "+perc);
		}
	}
	catch (ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
	}
	finally
	{
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
