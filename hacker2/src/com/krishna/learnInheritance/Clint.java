package com.krishna.learnInheritance;

public class Clint {
	public static void main(String[] args) {
		
		Parent p= new Parent();
		Child c= new Child();
		Parent pc= new Child();
		
		//System.out.println(p.a);
		//System.out.println(p.b);
		//System.out.println(p.c);
		//p.print();
		
		//System.out.println(c.x);
		//System.out.println(c.y);
		//System.out.println(c.z);
		
		//c.write();
		//c.print();
		
		//System.out.println(c.a);
		//System.out.println(c.b);
		//System.out.println(c.c);
		
		//System.out.println(pc.a);
		//System.out.println(pc.b);
		/*System.out.println(pc.c);
		p.print();
		c.print();
		pc.print();*/
		
		c.hello();
		Child.hello();
		p.hello();
		Parent.hello();
		pc.hello();
		
		
		
	}

}
