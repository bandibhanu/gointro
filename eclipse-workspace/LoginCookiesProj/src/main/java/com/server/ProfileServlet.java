package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		
		Cookie ck[]=request.getCookies();
		if(ck!=null) {
			String name=ck[0].getValue();
			if(!name.equals("")||name!=null) {
				out.print("<br>welcome to "+name+" profile");
			}
		}else {
			out.print("plese login to see the profile page");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
	}
}
