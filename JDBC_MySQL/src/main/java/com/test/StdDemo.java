package com.test;

import java.util.List;
import java.util.Scanner;

public class StdDemo {
public static void main(String[] args) {
		
		StudentDao sdao = new StudentDao();
		
		Student st = new Student();
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("usn");
//		String usn = sc.next();
//		
//		System.out.println("name");
//		String name = sc.next();
//		
//		System.out.println("dept");
//		String dept = sc.next();
//		
//		System.out.println("clg");
//		String clg = sc.next();
			
		
				
		st.setUsn("123");
		st.setName("abc");
		st.setDept("cse");
		st.setClg("xyz");
	
		sdao.saveStudent(st);
//	
		System.out.println("Saved Employee data");
//	
		System.out.println("student details");
		List<Student> data = sdao.getAllStudent();
		
		data.forEach(System.out::println);
		
		sdao.updateStudent(st);
//		
		System.out.println("updated");

		System.out.println("student details");
		List<Student> data1 = sdao.getAllStudent();
		data1.forEach(System.out::println);
//		
		
		sdao.deleteStudent("");
}
}







