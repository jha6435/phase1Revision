package com.krishna;

import java.util.Scanner;

public class RomanNumberConverter {

	public static void main(String[] args) {
		
	Scanner obj= new Scanner(System.in)	;
	System.out.println("enter your mobile no");
	String mob =obj.next();
	System.out.println(mob.charAt(0));
	if(mob.length()== 10) {
		System.out.println("your 10 digit mobile no is "+mob);
	}else
		System.out.println("please enter 10 digit mobile no");
		
	obj.close();

	}

}
