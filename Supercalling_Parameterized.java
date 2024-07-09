package inheritance_java;
class Multiplication
{
	Multiplication(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
}
class Addition extends Multiplication
{
	Addition(int a1,double b1)
	{
		super(2,3);
	double d=a1+b1;
	System.out.println(d);
	}
}

public class Supercalling_Parameterized extends Addition
{
	Supercalling_Parameterized(String a)
	{
		super(1,0.5);
		System.out.println("nidhi");
	}
	
public static void main(String[] args) 
{
	
	Supercalling_Parameterized s1=new Supercalling_Parameterized("Nihasvi");
	
}
}
