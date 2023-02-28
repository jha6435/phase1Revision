package com.demo.utube;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		
		Stack<Integer> no=new Stack<Integer>();
		
		
		no.push(20);
		no.push(23);
		no.push(25);
		no.push(29);
		no.push(20);
		no.push(52);
		System.out.println(no);
		System.out.println(no.peek());
		System.out.println(no.pop());
		System.out.println(no);
	}

}
