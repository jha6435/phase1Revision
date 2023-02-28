package com.mypackage;

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		MyThread t= new MyThread();
		t.run();
		for(int i=0;i<10;i++)		//no thread created in this program but output is same
		{
		
		System.out.println("main thread");
			
		
	}

}}
