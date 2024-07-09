package inheritance_java;
abstract class Newclass
{
	abstract void add();
	abstract void sub();
	
}
abstract class Newclass_Two extends Newclass
{
abstract void add1();
abstract void sub1();
}

public class Newclass_One extends Newclass_Two
{
	void mul()
	{
		int a=20;
	double b=2.5;
	double mul=a*b;
	System.out.println("multiplication of 2 numbers"+mul);
	}
	static void div()
	{
		int a1=5;
		int b1=5;
		int div=a1/b1;
		System.out.println("division of 2 nymbers"+div);
		
	}
	public static void main(String[] args) 
	{
		Newclass_One n1=new Newclass_One();
		n1.mul();
		div();
		n1.add1();
		n1.sub();
		n1.add();
		n1.sub1();
		
	}
	void add1() {
		
		int a2=5;
		int b2=3;
		int c2=a2+b2;
		System.out.println("addition of 2 numbers"+c2 );
	}
	
	void sub1() {
	
		System.out.println("substraction of 2 numbers");
	}
	
	void add() {
		System.out.println("addition");
		
		
		
	}

	void sub() {
		
		System.out.println("substraction");
	}

}
