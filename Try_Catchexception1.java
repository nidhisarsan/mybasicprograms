package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catchexception1 {
	public static void main(String[] args) {
		try
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter valid age");
		int age=s1.nextInt();
		System.out.println("enter the salary");
		double salary=s1.nextDouble();
		System.out.println("enter weight");
		float weight=s1.nextFloat();
		System.out.println("are you a student");
		boolean name=s1.nextBoolean();
				
		
		
	}
		catch(InputMismatchException b1)
		{
			System.out.println("please fill details again");
			Scanner s2=new Scanner(System.in);
			System.out.println("enter valid age");
			int age1=s2.nextInt();
			System.out.println("enter valid salary");
			double salary2=s2.nextDouble();
			System.out.println("enter valid weight");
			float weight2=s2.nextFloat();
			System.out.println("are you a student or not");
			boolean student=s2.nextBoolean();
			
			
			
			
			
			
			
		}
	
	}	

}
