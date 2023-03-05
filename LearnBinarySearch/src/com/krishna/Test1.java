package com.krishna;

public class Test1 {

	public static void main(String[] args) {
		
		int []oned=new int[] {1,2,3,4,6,7,9};
		//System.out.println(oned.length);
		//System.out.println(oned[6]);
		int find=6;
		boolean isFind=false;
		
		for(int i=0;i<oned.length;i++) {
			if(oned[i]==find)
				System.out.println("element found at : "+i);
			isFind=true;
			break;
		
		}
		
	if(isFind==false)
			System.out.println("element not found");	
		
		
	
		

	}

}
