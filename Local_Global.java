package basics.if_else;

public class Local_Global {
	int age=90;//non static global variable
	static double salary=9087.87;//static global variable
	static void add()
	{
	}
	public static void main(String[] args) 
	{
		System.out.println(salary);//accessing static global veriable
		Local_Global l1=new Local_Global();//accessing non static global variable
		System.out.println(l1.age);
	}
	}


