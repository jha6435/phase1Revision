package com.hackerRank.practice;

public class RevString {
	
	
	public static void main(String[] args) {
		String s ="ABCD";
		String rev="";
		
		//1 concatanation method
		
	/*	for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+ s.charAt(i);
			
		}
		System.out.println(rev);*/
		
	//2. char array method	
		
	/*	char[]a=s.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
	
		System.out.println(rev);
	}*/
	
	StringBuilder sb= new StringBuilder(s);
	System.out.println(sb.reverse());

}}
