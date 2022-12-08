package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpServletEx extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(request, response);
		String username=request.getParameter("username");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("this is reponce from the POST server "+username);
		out.println("</body></html>");
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(request, response);
		String username=request.getParameter("username");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("this is reponce from the GET server"+username);
		out.println("</body></html>");
	}

}
