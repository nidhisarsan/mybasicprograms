package basics.if_else;

import java.util.Scanner;

public class Area_rectangle {
	static Scanner s1=new Scanner(System.in);
	 void area()
	{
		int a=s1.nextInt();
		int b=s1.nextInt();
		int area=a*b;
		System.out.println("area of the rectangle->"+area);
	}
	public static void main(String[] args) {
		Area_rectangle a1=new Area_rectangle();
		a1.area();
		
		
		
		
	}
	
			

}
