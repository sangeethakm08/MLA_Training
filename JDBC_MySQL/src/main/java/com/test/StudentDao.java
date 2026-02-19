package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class StudentDao {


	public static Connection getCon() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mlafeb";
		
		String user = "root";
		String pas = "root@39";
		
		Connection con = null;
		try {
			
			Class.forName(driver);
			
			con = DriverManager.getConnection(url,user,pas);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void saveStudent(Student std) {
	
		try {
			
			String sql = "insert into student (usn, std_name, dept, clg) values(?,?,?,?) ";
			
			Connection con = StudentDao.getCon();
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, std.getUsn());
			pst.setString(2, std.getName());
			pst.setString(3, std.getDept());
			pst.setString(4, std.getClg());
			
			pst.execute();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public List<Student> getAllStudent(){
		List<Student> stdList = new ArrayList<>();
		
		try {
			
			String sql = "select * from student";
			
			PreparedStatement pst = StudentDao.getCon().prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				Student std =new Student();
				std.setUsn(rs.getString(1));
				std.setName(rs.getString(2));
				std.setDept(rs.getString(3));
				std.setClg(rs.getString(4));
				
				stdList.add(std);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stdList;
	}
	
	public void updateStudent(Student std) {
		try {
			
			String sql = "update student set std_name = ?, dept=?, clg=? where usn=?";
			
			PreparedStatement pst = StudentDao.getCon().prepareStatement(sql);
			
			pst.setString(1, std.getName());
			pst.setString(2, std.getDept());
			pst.setString(3, std.getClg());
			pst.setString(4, std.getUsn());
			
			pst.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(String usn) {
		try {
			
			String sql = "delete from student where usn=?";
			
			PreparedStatement pst = StudentDao.getCon().prepareStatement(sql);
			
			pst.setString(1, usn);
			pst.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
