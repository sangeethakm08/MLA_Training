package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDemo {
	
	public static void main(String[] args) {
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		Book b = (Book) ctx.getBean("bk");
//		System.out.println(b);
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
		BookDetails b1 = ctx.getBean(BookDetails.class);
		Book b2 = ctx.getBean(Book.class);
		
		b1.setPages(23423);
		b1.setPublisher("adf");
		b1.setPyear(2231);
		
		List<BookDetails> list = new ArrayList<>();
		list.add(b1);
		
		b2.setId(122);
		b2.setName("dfg");
		b2.setAuthor("gvfd");
		b2.setPrice(123213);
		b2.setBd(list);
		System.out.println(b2);
		
	}
	
}
