package com.test.voter;



public class Datavalidator {
	

	public void checkAge(int age) {
		if(age >= 18) {
			throw(new AgeValidateExcetion("valid"));
		}
		else {
			throw(new AgeValidateExcetion("invalid"));

		}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
