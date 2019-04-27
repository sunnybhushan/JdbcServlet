package org.btm.SessionApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name=req.getParameter("nm");
		HttpSession hs=req.getSession();
		hs.getMaxInactiveInterval();
		//hs.invalidate();
		hs.setAttribute("nmg", name);
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body bgcolor='cyan'>");
		out.print("<form action='ss'>");
		out.print("<input type='submit' value='NextServlet'>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		out.flush();
		out.close();
		
	}
}
