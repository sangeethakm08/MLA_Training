package com.test.cls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.TreeSet;

public class Exp1 {
	public static void main(String[] args) {
		TreeSet data =  new TreeSet();
		data.add(200);
		data.add('a');
		data.add(33);
		data.add("java");
		data.add(20.540);
		data.add(false);
		data.add(200l);
		System.out.println(data);
		
		Iterator itr = data.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("======");
	data.forEach(System.out::println);
//		data.set(5, true);
//		data.subList(1,4);
//		
		System.out.println(data.size());
//		System.out.println(data.getFirst());
//		System.out.println(data.getLast());
		
//		ListIterator ltr =  data.listIterator();
//		while(ltr.hasNext()) {
//			System.out.println(ltr.next());
//		}
//		System.out.println("======");
//		while(ltr.hasPrevious()) {
//			System.out.println(ltr.previous());
//		}
	}
}
