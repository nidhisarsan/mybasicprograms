package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catchexception {
	  
	  
	public static void main(String[] args) {
		
		try
		{
			Scanner s1=new Scanner(System.in);
			  
			System.out.println("enter valid age");
			int age=s1.nextInt();
			System.out.println(age);
		
		}
		catch(InputMismatchException a1)
		{
			System.out.println("enter valid numeric age value ");
			Scanner s2=new Scanner(System.in);
			int age2=s2.nextInt();
			System.out.println(age2);
			
		}
		finally
		{
			System.out.println("no matter what but i will always be there");
		}
		System.out.println("enter valid name");
		Scanner s3=new Scanner(System.in);
		String name=s3.next();
		System.out.println(name);
		
		
	}

}
