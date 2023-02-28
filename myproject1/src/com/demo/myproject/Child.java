package com.demo.myproject;

public class Child extends Parent{
	
	
	Child(){
		
		this(10);
		System.out.println("child class 0 arg cons");
		
			}

	Child(int a){
		super();
		System.out.println("child class 1 arg cons");
	}
}
