package com.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");			
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t =session.beginTransaction();
		
		Order o1 = new Order();
		o1.setO_name("abcs");
		o1.setO_price("133");
		Order o2 = new Order();
		o2.setO_name("xyza");
		o2.setO_price("432");
		
		List<Order> list = Arrays.asList(o1,o2);
		
		Customer c1 = new Customer();
		c1.setC_name("abc");	
		c1.setOrders(list);
		
		session.persist(c1);
		
		t.commit();
		session.close();
	}

}
