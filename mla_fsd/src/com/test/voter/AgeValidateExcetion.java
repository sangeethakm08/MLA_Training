package com.test.voter;

public class AgeValidateExcetion extends RuntimeException {
	private static final long serialVersionUID =1L;
	public AgeValidateExcetion(String msg) {
		super(msg);
	}
}
