package com.test;

interface Inf1
{
	float pi = 3.14f;
	
	void disp();
	void cat();
	
	default void human() {
		System.out.println("Default interface");
		animal();
	}
	
	static String getUser(String msg) {
		//animal();
		return msg;
		
	}
	
	private void animal() {
		System.out.println("Private method");
	}
	/*
	 * public Inf1()*/
}


interface Inf2 {
	void book();
}

abstract class Abs1{
	public Abs1() {
		System.out.println("Constructor");
	}
	public abstract void fox();
	public void color() {
		System.out.println("implemeted method abs1");
	}
}
	class Impl1 extends Abs1 implements Inf1, Inf2 {
		@Override
		public void fox() {
			System.out.println("abs implemented");
		}
		@Override
		public void disp() {
			System.out.println("inf1 abs method");
		}
		@Override
		public void cat() {
			System.out.println("inf1 abs method");
		}
		@Override
		public void book() {
			System.out.println("inf2 abs method");
		}
		
	
	
}
public class Exmpl1 {
	
	public static void main(String[] args) {
		Impl1 obj = new Impl1();
		obj.book();
		obj.cat();
		obj.disp();
		obj.human();
		obj.fox();
		obj.color();
		System.out.println(Inf1.getUser("Hello"));
		
//		dynamic binding
		
	}
}

//
//ways to create object for a class
//using new operator
//factory method
//clone() method
//using class.forName() dynamic obj creation
