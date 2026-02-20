package com.test;

import java.util.List;

public class CustDemo {
	public static void main(String[] args) {
		
	CustomerDao cdao = new CustomerDao();
	
	Customer cst = new Customer();
	
//	cst.setC_id(1);
	cst.setC_name("SKY");
	cst.setC_city("Mumbai");
	
	cdao.saveCustomer(cst);
	
//	
//	System.out.println("Done");
//	
//	List<Customer> list = cdao.getAllCustomers();
//	
//	list.forEach(System.out::println);
	
	
//	cdao.updateCustomer(cst);
	
//	cdao.deleteCustomer(cst);
	}
}
