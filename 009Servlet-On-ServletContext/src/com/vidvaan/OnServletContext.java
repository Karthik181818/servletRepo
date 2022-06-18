package com.vidvaan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OnServletContext
 */
public class OnServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext servletContext = getServletContext();
		String user = servletContext.getInitParameter("user");
		String pwd = servletContext.getInitParameter("pwd");
		out.println("<b>Read ContextParams Using Servlet Config..<b><hr><br>");
		out.println("<b>UserName:" + user + "<b><br>");
		out.println("<i>Password:" + pwd + "<i><br>");

	}

}
