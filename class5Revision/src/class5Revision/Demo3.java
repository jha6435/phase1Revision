package class5Revision;

public class Demo3 {
	int id;
	String name;
	float salary;
	
	
	public static void testMethod() {
		System.out.println("just checking static method");
	}

	void printData() 
	{
		 System.out.println("this is method");
		 System.out.println("id : "+ id);
		 System.out.println("name : "+ name);
		 System.out.println("salary : "+ salary);
	}

	Demo3(int did, String dname, float dsalary) 
	{
		 id= did;
		name= dname;
		salary=dsalary;
	}



public static void main(String[] args) {

	
	Demo3.testMethod();
	
	
	Demo3 d= new Demo3(102, "suraj",9800.90f);
	d.printData();
	

}

}
