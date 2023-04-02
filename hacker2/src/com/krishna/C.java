package com.krishna;

public class C {

	public int id;
	public String name;
	
	C(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "C [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		
		C c=new C(102,"sheela");
		System.out.println(c.id);
		System.out.println(c.name);
		//System.out.println(c);
	}
}
