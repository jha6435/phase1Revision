package com.krishna;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
public  class Test2 {
	public static void main(String[] args) throws IOException {
		
		Employee emp= new Employee(1001, "suresh", 2000);
		FileOutputStream fout=new FileOutputStream("D:\\CODE\\forSerialization\\empdata.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);	
		out.writeObject(emp);
		System.out.println("serialization complete");
	}



	}

}
