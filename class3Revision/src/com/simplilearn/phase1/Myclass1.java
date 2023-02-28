package com.simplilearn.phase1;

import java.util.Scanner;

public class Myclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		
		int age;
		float salary;
		String name;
		
		System.out.println("enter your name");
		System.out.println("enter your salary");
		System.out.println("enter your age");
		name=obj.nextLine();
		salary=obj.nextFloat();
		age=obj.nextInt();
		System.out.println("name ="+ name);
		System.out.println("salary ="+ salary);
		System.out.println("age ="+ age);
		
		
		obj.next();

	}

}
