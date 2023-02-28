package class5Revision;

import java.util.Scanner;

public class Employee {
	
	private int id;
	private double salary;
	private String name;
	
	public static String company="microsoft";
	
	public void readData()

	{
		Scanner obj =new Scanner(System.in);
		System.out.println("enter id");
		id= obj.nextInt();
		System.out.println("enter name");
		name= obj.nextLine();
		name+= obj.nextLine();
		System.out.println("enter salary");
		salary= obj.nextDouble();
		
	}
	
	public void printData()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(Employee.company);
	}

}
