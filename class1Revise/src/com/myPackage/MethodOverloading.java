package com.myPackage;

public class MethodOverloading {
	
	public static int myMethod1(int x,int y) {
		return x+y;
	}
	
	public static double myMethod2(double x, double y) 
	{
		return x+y;
	}
	public static void main(String[] args) 
	{
		System.out.println(myMethod1(5,8));
		System.out.println(myMethod2(2.4,5.0));
	}
}
