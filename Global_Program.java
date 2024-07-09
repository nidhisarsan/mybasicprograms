package basics.if_else;

public class Global_Program {
	static double pi=3.14;//static global variable
	static void area()
	{
		int r=7;
		double area =pi*r*r;
		System.out.println(area);
	}
	public static void main(String[] args) {
		int r=10;
		double area =pi*r*r;
		area();
		System.out.println(area);
		
	}
	

	
	
}
