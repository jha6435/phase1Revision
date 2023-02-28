package com.demo.collection;

import java.util.ArrayList;

public class ArrayListTypeSafe  {

	public static void main(String[] args) {
		
		Emp e1= new Emp("ratan",111);
		Emp e2= new Emp("annu",222);
		Emp e3= new Emp("aruna",333);
		Emp e4= new Emp("sravya",444);
	
	ArrayList <Emp> a1= new ArrayList<Emp>();
	
	a1.add(e1);
	a1.add(e2);
	ArrayList<Emp> a2= new ArrayList<Emp>();
	
	a2.addAll(a1);
	a2.add(e3);
	a2.add(e4);
	
	System.out.println(a2.contains(e1));
	System.out.println(a2.containsAll(a1));
	a2.remove(a1);
	System.out.println(a2.contains(e1));
	System.out.println(a2.containsAll(a1));
			
	for(Emp e:a2) {
		System.out.println(e.eid+"---"+e.name);	
	}

		
		
		
		
		
		
	}

}
