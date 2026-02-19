package com.test;

@FunctionalInterface // only one abstract method
interface FunInf {
	void draw();
	// void color();
	default void dog() {
		
	}
	static void cat() {
		
	}
}

class Circle implements FunInf
{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class Square implements FunInf {
	@Override
	public void draw() {
		System.out.println("Square");
	}
//	factory method 
	public Square getObj() {
		System.out.println("Object returned");
		return new Square();
	}
}
public class Exmpl2 {

	public static void main(String[] args) {
		FunInf obj1 = new Circle();
		obj1.draw();
		FunInf obj2 = new Square();
		obj2.draw();
//		Square obj3 = obj2.getObj();
		FunInf obj3 = () -> System.out.println("Circle");// lambda expression
		obj3.draw();

	}

}
//dynamic binding - parent referance to child class
