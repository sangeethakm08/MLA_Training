package com.test;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLTest {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		String hql1 = "select c_name, c_city from Customer";
		
//		String hql2 = "delete from Customer where c_id=:id";
//		Query q = session.createQuery(hql2);
//		q.setParameter("id", 2);
		
//		int row =q.executeUpdate();
		
		
		
		Query<String> dt = session.createQuery(hql1);
		
		List<String> list = dt.getResultList();
		
		System.out.println("HQL result data");
		System.out.println(list.toString());
		t.commit();
		session.close();
		
	}
	
}
