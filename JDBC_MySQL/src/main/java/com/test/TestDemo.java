package com.test;

import java.util.*;


public class TestDemo {

	public static void main(String[] args) {
		
		EmpDao edao = new EmpDao();
		
		Employee emp1 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID");
		int id = sc.nextInt();
		
		System.out.println("name");
		String name = sc.next();
		
		System.out.println("com");
		String cmp = sc.next();
		
		System.out.println("city");
		String city = sc.next();
			
		emp1.setId(id);
		emp1.setName(name);
		emp1.setCmp(cmp);
		emp1.setCity(city);
				
//		emp1.setId(3);
//		emp1.setName("hdjk");
//		emp1.setCmp("e y");
//		emp1.setCity("delhi");
	
//		edao.saveEmployee(emp1);
//	
//		System.out.println("Saved Employee data");
//	
		System.out.println("employee details");
		List<Employee> data = edao.getAllEmployees();
		
		data.forEach(System.out::println);
		
//		edao.updateEmployee(emp1);
//		
//		System.out.println("updated");

//		System.out.println("employee details");
//		List<Employee> data1 = edao.getAllEmployees();
//		data1.forEach(System.out::println);
//		
		
		//edao.deleteEmployee(4);
		

	}

}
