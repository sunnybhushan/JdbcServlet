package org.btm.forwardApp;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	String pname=req.getParameter("pn");
	String qty=req.getParameter("pq");
	//ADD REQUEST OBJECT INTO SCOPE//
	req.setAttribute("prdnm", pname);
	req.setAttribute("prdpt", qty);
	RequestDispatcher rd=req.getRequestDispatcher("ss");
	rd.forward(req, resp);
		
		
	}
}
