package com.demo.arraydeque;

import java.util.ArrayDeque;

public class LearnArrayDeque {

	public static void main(String[] args) {
		
		
		ArrayDeque<Integer> num = new ArrayDeque<Integer>();
		
		num.offer(42);
		num.offer(13);
		num.offer(14);
		num.offer(75);
		num.offer(16);
		num.offer(17);
		num.offer(18);
		System.out.println(num);
		num.offerFirst(81);		//set to first element
		num.offerLast(91);		//set to last element
		System.out.println(num);
		
		
		System.out.println(num.peek());
		System.out.println(num.peekFirst());
		System.out.println(num.peekLast());
		
		
		System.out.println(num.poll());
		System.out.println(num.pollFirst());
		System.out.println(num.pollLast());
		System.out.println(num);
		

	}

}
