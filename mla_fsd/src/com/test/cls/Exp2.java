package com.test.cls;

import java.util.HashMap;

public class Exp2 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> data = new HashMap<>();
		
		data.put("sony", 330);
		data.put("lenovo", 320);
		data.put("dell", 200);
		data.put("apple", 505);
		data.put("dell", 354);
		data.put(null, 11);
		
		data.forEach((k,v)-> System.out.println(k+" : "+v));
		System.out.println(data.get("sony"));

	}
}                                                    
 