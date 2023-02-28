package com.demo.Linkedlist;

import java.util.LinkedList;

public class LearnLinkedList {

	public static void main(String[] args) {
		
	LinkedList<String>name=new LinkedList<String>();
	
	name.add("raju");
	name.add("aman");
	name.add("suraj");
	
	name.add("priti");
		System.out.println(name);
	name.remove("aman");
	System.out.println(name);
name.remove(0);
System.out.println(name);
System.out.println(name.isEmpty());
name.add(1, "sanjay");
name.add(2, "krishna");
System.out.println(name);
	}

}
