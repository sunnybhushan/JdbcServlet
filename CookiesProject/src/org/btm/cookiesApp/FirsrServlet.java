package org.btm.cookiesApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class FirsrServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name=req.getParameter("nm");
		Cookie ck= new Cookie("nmg", name);
		ck.setMaxAge(-1);
		resp.addCookie(ck);
		PrintWriter out =resp.getWriter();
		out.print("<html>");
		out.print("<body bgcolor='pink'>");
		out.print("<form action='ss'>");
		out.print("<input type='submit' value='NextServlet'>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		out.flush();
		out.close();
	}
}
