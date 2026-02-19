package com.test.voter;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		Datavalidator dv = new Datavalidator();
		dv.checkAge(age);
		sc.close();
	
	
	
	
	}
	

}
