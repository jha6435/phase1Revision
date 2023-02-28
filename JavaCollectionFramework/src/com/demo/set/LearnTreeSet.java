package com.demo.set;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

	public static void main(String[] args) {
		
		
		Set<Integer> num= new TreeSet<Integer>();
		
		num.add(21);
		num.add(12);
		num.add(16);
		num.add(2);	// sorting in ascending order without repetition
		num.add(100);
		num.add(100);
		System.out.println(num);
		
		

	}

}
