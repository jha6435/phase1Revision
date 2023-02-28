package com.krishna.learnInheritance;

public class Child extends Parent {
	
	
	
	int x=50;
	int y=55;
	int z=60;
	
	public void write() {
		System.out.println("this is child write method");
	}

	@Override
	public void print() {
		System.out.println("this is override method");
	}

	
	public static void hello() {
		System.out.println("hello from child");
	}
}
