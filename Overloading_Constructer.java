package basics.if_else;

public class Overloading_Constructer {
	Overloading_Constructer(int a)
	{
	System.out.println("int data type");
	}
	Overloading_Constructer(boolean b)
	{
		System.out.println("boolean data type");
	}
	Overloading_Constructer(char c)
	{
		System.out.println("charachter data type");
	}
	Overloading_Constructer(String d)
	{
		System.out.println("String data type");
	}
	public static void main(String[] args) {
		/*
		Overloading_Constructer c1=new Overloading_Constructer("NIDHI");
		Overloading_Constructer c2=new Overloading_Constructer(true);
	    Overloading_Constructer c3=new Overloading_Constructer('j');
		Overloading_Constructer c4=new Overloading_Constructer(5);
		*/
		new Overloading_Constructer("NIDHI");//this is another way to creat an object in constructer
		new Overloading_Constructer(true);
		new Overloading_Constructer('j');
		new Overloading_Constructer(5);
	}
	
	
}

	
