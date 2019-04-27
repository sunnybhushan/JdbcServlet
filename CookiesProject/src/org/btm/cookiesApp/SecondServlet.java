package org.btm.cookiesApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Cookie c[]=req.getCookies();
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='yellow'>"
				+ "<h1>Cookies object value "+c[0].getValue()+"</h1>"
						+ "</body></html>");
		out.flush();
		out.close();
	}
}
