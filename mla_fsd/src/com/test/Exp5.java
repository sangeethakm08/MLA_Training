package com.test;

import java.awt.print.Printable;

public class Exp5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage()); //getMessage - only msg
			System.out.println(e); // printing exception class object 
			e.printStackTrace(); // printStackTrace
		}
	}

}
