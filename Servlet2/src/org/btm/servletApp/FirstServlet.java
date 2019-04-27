package org.btm.servletApp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/sunny")
public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		String fname=req.getParameter("fn");
		String lname=req.getParameter("ln");
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='lightgreen'>"
				+ "<h1>Culprit "+ fname+" " +lname +"</h1>"+"</body></html>");
	}

}
