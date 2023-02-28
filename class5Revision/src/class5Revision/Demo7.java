package class5Revision;

public class Demo7 extends Demo6 {
	
	// @override can only be used with non static method

	@Override
	public  void sayGm() {
		System.out.println("subh prabhat");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Demo6 g= new Demo6();
		Demo7 b = new Demo7();
		b.sayGm();
		
		g.ravi();
		
		sayHi();
		Demo6.sayHello();
		

	}

}
