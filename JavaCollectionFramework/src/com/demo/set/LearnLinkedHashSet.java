package com.demo.set;

import java.util.LinkedHashSet;

public class LearnLinkedHashSet {

	public static void main(String[] args) {
		
		
		
		LinkedHashSet<Integer> num= new LinkedHashSet<Integer>();
		
		num.add(12);
		num.add(15);
		num.add(4);
		num.add(16);	//output same as input
		num.add(11);
		num.add(100);
		num.add(12);
		num.add(100);
		System.out.println(num);

	}

}
