package com.demo.set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {

	public static void main(String[] args) {
		
		
		Set<Integer> num =new HashSet<Integer>();
		num.add(42);
		num.add(21);
		num.add(63);
		num.add(13);
		num.add(100);
		num.add(3);
		num.add(15);
		System.out.println(num);	// print element in random order
		
		num.remove(63);
		num.remove(3);
		System.out.println(num);
		num.add(100);
		num.add(42);
		System.out.println(num);

	}

}
