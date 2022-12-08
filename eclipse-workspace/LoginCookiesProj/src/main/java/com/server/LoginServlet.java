package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		String username=request.getParameter("username");
		String userpass=request.getParameter("userpass");
		
		if(userpass.equals("1234") && username!=null) {
			out.print("<br>you are successfully logged in");
			out.print("<br>Welcome, "+username);
			
			Cookie ck=new Cookie("name",username);
			response.addCookie(ck);
			
		}else {
			out.print("<br>Entered wrong password");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
		
	}

}
