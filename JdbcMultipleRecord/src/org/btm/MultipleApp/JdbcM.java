package org.btm.MultipleApp;
import java.sql.*;
public class JdbcM
{
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String qry="insert into college.student values ('sunnyy', 45)";
		String qry1="insert into college.student values ('Ravi', 2)";
		String qry2="insert into college.student values ('Sunil', 3)";
		String qry3="insert into college.student values ('Ram', 4)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class is loaded & Registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("Connection Establish with DBserver");
			stmt=con.createStatement();
			System.out.println("Platform Created");
			stmt.execute(qry);
			stmt.execute(qry1);
			stmt.execute(qry2);
			stmt.execute(qry3);
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
