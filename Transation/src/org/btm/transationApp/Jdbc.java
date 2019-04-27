package org.btm.transationApp;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Jdbc 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
	try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
	catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
