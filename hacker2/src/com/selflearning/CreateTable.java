package com.selflearning;
import java.util.Scanner;

public class CreateTable {
	public static void main(String [] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a no to print table: ");
		int num=obj.nextInt();
		System.out.println("the table is");
		for(int i=1;i<11;i++) {
				
		System.out.println(num+" x "+i+" = "+num*i);
		}
		obj.close();
	}
	
	

}
