package com.demo.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		al.add(10);
		al.add("ratan");
		al.add("durga");
		al.add(10.5);
		System.out.println(al);
		System.out.println(al.size());
		al.add(1,"annu");
		al.add(3,33);
		System.out.println(al);
		System.out.println(al.size());
		al.remove(5);
		System.out.println(al.size());
		al.remove("ratan");
		System.out.println(al);
		System.out.println(al.contains("durga"));
		System.out.println(al.contains(10));
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());
		System.out.println(al);
	}

}
