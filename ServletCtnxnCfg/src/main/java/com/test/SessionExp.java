package com.test;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SessionExp")
public class SessionExp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("user");
//		Cookie ck = new Cookie("info", user);	
//		response.addCookie(ck);
		
		System.out.println("from login servlet");
		
		
		
		HttpSession session = request.getSession();
		session.setAttribute("info", user);
		
		ServletContext ctx = getServletContext();
		int t = (int)ctx.getAttribute("tusers");
		
		int c = (int)ctx.getAttribute("cusers");
		
		out.println("From login page: " +user);
		
		out.println("<br>total user: "+t);
		out.println("<br>current user: "+c);

		out.println("<br> <a href='Logout1'>logout here</a> ");
		
		
	}

}
