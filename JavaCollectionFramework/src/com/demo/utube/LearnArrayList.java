package com.demo.utube;

import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<String>();
		
	name.add("raju");
	name.add("kaju");
	name.add("depu");
	name.add("ruchi");
	name.add("ram");
	//System.out.println(name);
	name.add(0, "sakshi");
	
	name.add(2,"sultan");
	System.out.println(name);
	
	name.remove(3);
	System.out.println(name);
	name.remove("ruchi");
	System.out.println(name);
	System.out.println(name.contains("ruchi"));
	System.out.println(name.contains("sakshi"));
	//name.clear();
	System.out.println(name);
	System.out.println(name.get(3));
	System.out.println(name.get(2));
	System.out.println(name.set(1, "rupesh"));
	System.out.println(name);

	
	
	ArrayList<String> name2= new ArrayList<String>();
	name2.add("sangam");
	name2.add("roshan");
	name2.add(1, "uma");
	name2.add(2, "Ram babu");
	System.out.println(name2);
	
	
	//System.out.println(name.addAll(name2));
	System.out.println(name);
	
	
	
	
	
	}

}
