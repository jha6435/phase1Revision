package com.hackerRank.practice;

import java.util.Scanner;

public class Demo2 {
			
		public static void main(String[] args) {
		
		
		System.out.println("hellow user");
		System.out.println("enter any no. between 1 to 100");
		
		Scanner obj = new Scanner(System.in);
		int n =obj.nextInt();
		obj.close();
		
		if(n%2==0) 
		{
			if( n<=5) {
				System.out.println("not weird");}
				else if( n<=20){
					System.out.println("weird");
				}
				else if(n>20) {
					 System.out.println("not weird");
				 }
			}
		else {
			System.out.println("weird");
		}
		
		

		
		
	}
}

