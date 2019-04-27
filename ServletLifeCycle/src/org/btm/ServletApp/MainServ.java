package org.btm.ServletApp;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class MainServ extends GenericServlet 
{
	public MainServ() 
	{
		System.out.println("Servlet Object is created");
	}
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("Servlet Object is Initialized");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
		String name=req.getParameter("fn");
		String place=req.getParameter("pl");
		
		PrintWriter out= resp.getWriter();
		out.print("<html><body bgcolor='cyan'>"
				+ "<h1>Welcome "+name+" "+place+" </h1>"
						+ "</body></html>");
		out.flush();
		out.close();
		System.out.println("service method is executed");
	}
	@Override
	public void destroy() {
		System.out.println("close costly resources");
	}
}
