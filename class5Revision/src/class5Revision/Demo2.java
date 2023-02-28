package class5Revision;

public class Demo2 {
	
	 int id;
	 String name;
	 float salary;
	 
	 void printData() 
	 {
		 System.out.println("this is method");
		 System.out.println("id : "+ id);
		 System.out.println("name : "+ name);
		 System.out.println("salary : "+ salary);
	 }
	 
	
	Demo2(int id, String name, float salary) 
	{
		 this.id= id;
		this.name= name;
		this.salary=salary;
	}
	
	public static void main(String[] args) {
	
		Demo2 d= new Demo2(101, "raju",1200.90f);
		d.printData();
		

	}

}
