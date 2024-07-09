package basics.if_else;

public class Nonstaticmethod_Java {
	void add()//non static method1
	{
		System.out.println("addition");
		
	}
	void substract()//non static methos2
	{
		System.out.println("substraction");
	}
	public static void main(String[] args) 
	{
		Nonstaticmethod_Java n1 = new Nonstaticmethod_Java();
		n1.add();
		n1.substract();
		
		
		
	}

}
