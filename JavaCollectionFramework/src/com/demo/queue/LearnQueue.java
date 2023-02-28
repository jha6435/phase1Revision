package com.demo.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

	public static void main(String[] args) {
		

		Queue <Integer> num =new LinkedList<>();
		
		num.offer(12);
		num.offer(24);
		num.offer(36);
		num.offer(48);
		num.offer(60);
		
		System.out.println(num);
		
		
		
		num.poll();
		System.out.println(num);
		System.out.println(num.peek());
		num.poll();
		System.out.println(num);
		
		num.add(72);
		num.add(84);
		System.out.println(num);
		
		System.out.println(num.element());
		num.remove(72);					// normally follow fifo but you can delete selected element
		System.out.println(num);
		
	}

}
