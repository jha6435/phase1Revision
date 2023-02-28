package com.krishna;

public class PalindromeChecker {

	public static void main(String[] args) {
		
		String state ="anna";
		StringBuilder sb=new StringBuilder(state);// String buffer and StringBuilder any class we can use.
		sb.reverse();
		String data=sb.toString();
		
		if(state.equalsIgnoreCase(data)) {
			System.out.println(state+" is palindrome");
		}else {
			System.out.println(state+" is not a palindrome");
		}
			

	}

}
