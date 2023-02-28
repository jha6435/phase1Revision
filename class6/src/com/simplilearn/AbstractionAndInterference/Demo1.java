package com.simplilearn.AbstractionAndInterference;


abstract class Salary
{
	
	public int getHra(int basic)
{
	return basic*40/100;
}
	
public int getPf(int basic) 
{
	return basic*12/100;
}

public abstract int getSa();
public abstract int getCa();
}

class Microsoft extends Salary{

	@Override
	public int getSa() {
		// TODO Auto-generated method stub
		return 18000;
	}

	@Override
	public int getCa() {
		// TODO Auto-generated method stub
		return 13000;
	}
	public int getCovidAssistance() {
		return 6000;
	}
	
	
	
		
	}

public class Demo1 {
	
	public static void main(String[] args) {
		
		
	
	 Microsoft a = new Microsoft();
	System.out.println(a.getCovidAssistance());
	System.out.println(a.getSa());
	System.out.println(a.getCa());
	System.out.println(a.getHra(50000));
	System.out.println(a.getPf(65000));
	
	
	
		
		
	}
	

		
		
	}
