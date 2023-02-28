package com.simplilearn.AbstractionAndInterference;

import java.util.ArrayList;

public class Demo2 {
		// arrayList program with for each loop
	
	public static void main(String[] args)
	{
		ArrayList<Integer> data = new ArrayList<Integer>();
		{data.add(2);
		data.add(4);
		data.add(6);
		data.add(8);}
		
		int sum=0;
		for(int d :data)
		{	sum= sum+d;}
		System.out.println(sum);

	}

}
