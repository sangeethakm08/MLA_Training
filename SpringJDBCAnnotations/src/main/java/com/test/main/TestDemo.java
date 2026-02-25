package com.test.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.DBConfig;
import com.test.model.Fruits;
import com.test.model.FruitsDao;

public class TestDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);
		FruitsDao dao = ctx.getBean(FruitsDao.class);
		
		Fruits f = new Fruits();
		
		f.setId(1);
		f.setName("abc");
		f.setPrice(44);
		f.setQuantity(15);
		
		dao.saveFruits(f);
		
		List<Fruits> list = dao.getAllFruits();
		
		list.forEach(System.out::println);
		
//		dao.deleteFruits(f);
		
	}
}
