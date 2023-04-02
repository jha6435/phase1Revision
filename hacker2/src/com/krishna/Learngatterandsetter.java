package com.krishna;

public class Learngatterandsetter {
	private int id;
	private String name;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[]args) {
		Learngatterandsetter learn=new Learngatterandsetter();
		
		learn.getId();
		learn.setId(101);
		learn.getName();
		learn.setName("katrina");
		System.out.println(learn.id);
		System.out.println(learn.name);
		
		
	}
	
}
