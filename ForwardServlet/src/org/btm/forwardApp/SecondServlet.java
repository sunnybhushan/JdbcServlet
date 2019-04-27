package org.btm.forwardApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//FETCH REQUEST OBJECT BACK FROM SCOPE//
		String pname=(String)req.getAttribute("prdnm");
		String qty=(String)req.getAttribute("prdpt");
		int pqty=Integer.parseInt(qty);
		double price=20.00;
		double tolsum=(price*pqty);//BUSINESS LOGIC//
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='yellow'>"
				+ "<ht>Product Details Are  "+pname+" ="+tolsum+" Rs  </h1>"+"</body></html>");
		out.flush();
		out.close();//PRESENTATION LOGIC//
		
		Connection con=null;
		PreparedStatement pstmt=null;
		String qry="insert into btm.lenovo values(?,?,?)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt=con.prepareStatement(qry);
			
			//SET THE VALUES FOR PLACEHOLDER BEFORE EXECUTION//
			pstmt.setString(1,pname);
			pstmt.setInt(2,pqty);
			pstmt.setDouble(3,tolsum);
			pstmt.executeUpdate();			
			}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
		finally 
		{
			if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
}
















