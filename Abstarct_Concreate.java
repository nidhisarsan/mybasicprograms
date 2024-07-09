package inheritance_java;
   class Login
{
   static void add()
{
	System.out.println("addition");
}

  static void mod()
{
	System.out.println("modulus");
}
}
abstract class Testcase extends Login
{
	 abstract void login();//abstract method
	abstract void sub();//abstract method
	static void add(int a,int b)//concreat method
	{
	System.out.println("addition1");
	}
	void addition()//concreat method
	{
		System.out.println("addition3");
	}
	
}

public class Abstarct_Concreate extends Testcase
{

	void multiplication()
	{
		System.out.println("a*b");
	}
	void subtraction()
	{
		System.out.println("a-b");
	}
	public static void main(String[] args) {
		Abstarct_Concreate a1=new Abstarct_Concreate();
		
		add();
		mod();
		a1.multiplication();
		a1.subtraction();
		a1.login();
		a1.sub();
		add(2,3);
		a1.addition();
		
		
	}
	
	void login() {
		
		System.out.println("login to facebook");
	}
	
	void sub() {
		
		System.out.println("subatrction of 2 numbers");
	}
}

