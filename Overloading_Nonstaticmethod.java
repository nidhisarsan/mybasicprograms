package basics.if_else;

public class Overloading_Nonstaticmethod {
	void add(double a)//parameterized non static method
	{
		double sum=a+6;
		System.out.println(sum);
	}
	void add(int a)
	{
		int sum=a+6;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		Overloading_Nonstaticmethod c1=new Overloading_Nonstaticmethod() ;
		c1.add(3.5);
		c1.add(5);
	}

}
