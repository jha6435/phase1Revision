package com.krishna;

public class ForBinarySearch {
public static void main(String[] args) {
	
	int []data =new int[] {23,24,26,28,29,40,43,49,55,59,65,67,78,82,81,90,91,27};
	
	int low,high,mid;
	int search=40;
	boolean isFound=false;
	low=0;
	high=data.length;
	System.out.println(high);
	mid=(low+high)/2;
	System.out.println(mid);
	
	while(true) {
		if(search==data[mid]) {
			System.out.println("element found at index : "+mid);
			isFound=true;
			break;
		}else {
			if(search>data[mid]) {
				low=mid;
			}else {
				high=mid;}
		}
		mid=low+high/2;
	}
		
}
}
