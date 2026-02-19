package com.test;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		String user = request.getParameter("user");
//		String pas = request.getParameter("pas");
		
		ServletContext ctx = getServletContext();
		
		String ct = ctx.getInitParameter("city");
		String st = ctx.getInitParameter("state");
		
		String dt = ct+" "+st;
		
		ctx.setAttribute("info", dt);
		
		ServletConfig cfg = getServletConfig();
		
		String user = cfg.getInitParameter("user");
		String pas = cfg.getInitParameter("pas");
		
		out.println("cfg data from login servlet: "+user+" "+pas);
			
		out.println("ctx data from login servlet: " +dt);
		
		out.println("<br><a href='Logout'>log out here</a>");
		
	}

}
