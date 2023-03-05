package com.krishna;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.Writer;

class Student implements Serializable{
	private int rollno;
	private String name;
	private String city;
	
	public Student() {}

	public Student(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
public class LearnSerialization{

public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		//Student stud=new Student(1, "Rupesh", "faridabad");
		/*FileOutputStream fout=new FileOutputStream("D:\\CODE\\forSerialization\\studentdata1.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(stud);
		System.out.println("serializable working");
*/
		
		
		FileInputStream fis= new FileInputStream("D:\\\\CODE\\\\forSerialization\\\\studentdata1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student stud=(Student) ois.readObject();
		System.out.println("sutdent roll no "+stud.getRollno());
		System.out.println("sutdent name "+stud.getName());
		System.out.println("sutdent city "+stud.getCity());
	}

}
