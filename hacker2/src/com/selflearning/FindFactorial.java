package com.selflearning;

public class FindFactorial {
	public FindFactorial(int b) 
	
	{int fact=1;
	int sum=0;
	System.out.println("the factorial of "+b+" is :");
	for(int i=1;i<=b;i++) {
		fact=fact*i;
		sum=sum+fact;
		System.out.println(sum);
	}
	}
public static void main(String[] args) {
	new FindFactorial(3);
	
	
}

	}


