package com.simplilearn.phase1;

public class Class3 {

	public static void main(String[] args) {
		
		int[] data= new int []
				{
						56,65,99,76,73
				};
		
		int big= data[0];
		for(var d:data)
		{
		if(d>big)
		big=d;
	}
		System.out.println(big);
	}
}
