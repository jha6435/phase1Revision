package com.krishna;

public class Solution {
public static void main(String[] args) {
	
	int[] data=new int[] {89,78,65,43,55,67,90,24,26,49,29,40,59,91,82,83};
	
	int search=90;
	boolean isFound=false;
	
	for(int i=0;i<data.length;i++) 
	{
		if(data[i]==search) 
			{
		System.out.println("Element found at index : "+i);
			isFound=true;
			break;
		}
		
	}
	
	if(isFound==false)
		System.out.println("element not found");
	
}
}
