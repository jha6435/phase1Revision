package com.krishna;

import java.util.Scanner;

public class LearnTryCatch3 {
	public static void main(String[]args) {

		try
		{Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		int num=s.nextInt();
		System.out.println(10/num);
		System.out.println("rupesh".charAt(7));
		s.close();}
		catch(ArithmeticException ae) {
			System.out.println("do not divide by zero");
		}
		catch(Exception e) {
			System.out.println("ratan it "+e);
		}
		System.out.println("rest of the code");
	}
	

}
