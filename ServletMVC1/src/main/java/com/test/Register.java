package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =  response.getWriter();
		
		String name = request.getParameter("fname");
		String user = request.getParameter("user");
		String pas = request.getParameter("pas");
		
		Customer cst = new Customer();
		cst.setFullName(name);
		cst.setUserNamel(user);
		cst.setPassword(pas);
		
		String sql = "insert into customer values ('"+cst.getFullName()+"','"+cst.getUserNamel()+"','"+cst.getPassword()+"')";
		
		try {
			
			Connection con = DBConnect.getCon();
			Statement stmt = con.createStatement();
			int dt = stmt.executeUpdate(sql);
			if(dt>0) {
				response.sendRedirect("login.html");
				
			}
			else {
				out.println("<font color='red'><h3 align='center'>Register failed</h3></font>");
				RequestDispatcher rd = request.getRequestDispatcher("register.html");
				rd.include(request, response);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
