package com.krishna;

import java.io.FileInputStream;
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
	}}

public class MyClass {
public static void main(String[] args) throws IOException {
	
	//1 part 1 serialization
	/*
	Employee emp= new Employee(103,"ravi",175000);
		// object to fileoutput stream is (serialization)
		
	FileOutputStream fout=new FileOutputStream("D:\\CODE\\forSerializationDemo\\employeedata.txt");
	ObjectOutputStream out= new ObjectOutputStream(fout);
	out.writeObject(emp);
	out.close();
	
	System.out.println("Serialization is done");	*/
	
	// part2 deserialization
	
	FileInputStream fis= new FileInputStream("");
	
	}

}
