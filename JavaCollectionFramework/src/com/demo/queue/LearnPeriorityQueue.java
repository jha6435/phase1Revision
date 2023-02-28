package com.demo.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPeriorityQueue {

	public static void main(String[] args) {
		
		
	PriorityQueue<Integer> no= new PriorityQueue<Integer>();
	
	no.add(23);
	no.offer(43);
	no.add(67);		// diff b/w add and offer is add gives error if not executed sucessfully
	no.add(100);
	no.add(83);
	no.offer(73);	
	System.out.println(no);	
	
	no.remove(100);
	no.poll();			// diff b/w remove and poll is remove gives error if not executed sucessfully
						//poll() method not work for Integer
	System.out.println(no);
	System.out.println(no.peek());
	System.out.println(no.element()); 	//diff b/w peek() and element() is element return exeception

	}

}
