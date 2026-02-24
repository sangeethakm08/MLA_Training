package com.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;



public class TestDemo {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student std = ctx.getBean("student", Student.class);
		System.out.println(std);
		
		ExpressionParser exp = new SpelExpressionParser();
		
		Expression ex = exp.parseExpression("'Simple MLA coders Spring EL'");
		String dt = ex.getValue(String.class);
		System.out.println(dt+" literals");
		
		Expression ex1 = exp.parseExpression("'Simple MLA coders Spring EL'".toUpperCase());
		String dt1 = ex1.getValue(String.class);
		System.out.println(dt1);
		
		Expression ex3 = exp.parseExpression("100*5");
		Integer dt2 = ex3.getValue(Integer.class);
		System.out.println(dt2);
		
	}
}
