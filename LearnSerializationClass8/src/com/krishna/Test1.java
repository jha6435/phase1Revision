package com.krishna;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable{
	int id;
	String name;
	float amount;
	public Customer(int id, String name, float amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
}
public class Test1 {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	//1 for serialization
	/*
	 * Customer cust= new Customer(1, "Tata", 46000);
	FileOutputStream fout= new FileOutputStream("D:\\CODE\\forSerializationDemo\\customerdata.txt");
	ObjectOutputStream out= new ObjectOutputStream(fout);
	out.writeObject(cust);
	out.close();
	System.out.println("serialization done");*/
	
	//2 for deserialization
	
	FileInputStream fis=new FileInputStream("D:\\CODE\\forSerializationDemo\\customerdata.txt");
	ObjectInputStream ois= new ObjectInputStream(fis);
	
	Customer cus=(Customer)ois.readObject();
	
	System.out.println("cust id: "+ cus.id);
	System.out.println("cust name: "+ cus.name);
	System.out.println("cust amount: "+ cus.amount);
}

	
}
