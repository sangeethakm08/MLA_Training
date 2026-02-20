package com.test;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Collage c1 = new Collage();
		
		c1.setC_name("abc");
		

		Student s1 = new Student();
		s1.setS_name("abc");
		s1.setS_type("regular");
		s1.setS_branch("CS");
		
		Faculty f = new Faculty();
		
		f.setF_type("dfdsd");
		f.setF_skill("jaj");
		
		
		session.persist(c1);
		session.persist(s1);
		session.persist(f);
 
		
		t.commit();
		
		session.close();
		

	}
}
