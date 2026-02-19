package com.test;

@FunctionalInterface
interface FunIntf {
	String greetUser(String name, String msg);
}

public class Exmpl3 {
	public void fun() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunIntf obj1 = (String name, String msg) -> {
			System.out.println("Hi "+name+" "+msg);
			return "Hello "+name+" MLA "+msg;
		};
		
//		Exmpl3 obj4 = new Exmpl3();
		
		
System.out.println(	obj1.greetUser("xyz", "Wlecome"));
//System.out.println(obj4.fun());
	}

}

//system class is  public final class from lang >javap java.lang.System
//out- public static final and static object for print stream  >javap java.io.PrintStream