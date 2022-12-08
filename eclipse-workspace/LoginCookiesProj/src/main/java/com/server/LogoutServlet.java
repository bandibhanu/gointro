package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		if(username!=null) {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		Cookie ck=new Cookie("name","");
		ck.setMaxAge(0);
		response.addCookie(ck);
		out.print("<br>logged out successfully");
		}else {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.print("login first to logout");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
	}
}
