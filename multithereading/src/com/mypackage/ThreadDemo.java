package com.mypackage;

public class ThreadDemo {

	public static void main(String[] args) // main thread
	{
		
		// user thread starting code
		MyThread t= new MyThread();
		t.start();	//2nd thread 
		
		// logics for main thread
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
		
	}

}
