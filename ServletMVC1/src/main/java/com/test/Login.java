package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("user");
		String pas = request.getParameter("pas");
		
		Customer cst = new Customer();
		
		String sql = "select username, password from customer where username = '"+user+"' and password= '"+pas+"'";
		
		try {
			Connection con = DBConnect.getCon();
			Statement stmt = con.createStatement();
			
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				cst.setUserNamel(rs.getString(1));
				cst.setPassword(rs.getString(2));
			}
			if(user.equals(cst.getUserNamel()) && pas.equals(cst.getPassword())) {
				response.sendRedirect("home.html");
				
			}
			else {
				out.println("<font color = 'red'><h3 align='center'>invalid credential</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}


//Servletcontext - data is global and it will create only one obj for entire application
//Servletconfig - data is local and it will create one object for every request
