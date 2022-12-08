package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class GenericServletEx extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String username=arg0.getParameter("username");
		
		arg1.setContentType("text/html");
		PrintWriter out=arg1.getWriter();
		out.println("<html><body>");
		out.println("this is reponce from the server"+username);
		out.println("</body></html>");
		
	}

}
