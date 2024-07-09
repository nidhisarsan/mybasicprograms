package basics.if_else;

public class Method_Overloadingin3methods 
{
	static void multiplication(int a)
	{
		int multiplication=2*a;
		System.out.println(multiplication);
		
	}
	static void multiplication(int a,int b)
	{
		int multiplication=2*a*b;
		System.out.println(multiplication);
	}
	void multiplication(int a)
	{
		int multiplication=2*a;
		System.out.println(multiplication);
	}
	void multiplication(int a,int b)
	{
		int multiplication=2*a*b;
		System.out.println(multiplication);
	}
	Method_Overloadingin3methods(int a)
	
	{
		System.out.println("int data type");
		
	}
	
	
	
	Method_Overloadingin3methods(String d)
	{
		System.out.println("String data type");
	}
	public static void main(String[] args) {
		multiplication(2);
		multiplication(2,3);
		Method_Overloadingin3methods m1=new Method_Overloadingin3methods("NIDHI");
		Method_Overloadingin3methods m2=new Method_Overloadingin3methods(5);
		m1.multiplication(2);
		m1.multiplication(3,4);
		
	}
}
		
