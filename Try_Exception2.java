package try_catch;

import java.util.InputMismatchException;

public class Try_Exception2 {
	public static void main(String[] args) {
		
		
		int rollno[]=new int[3];//Array
		rollno[0]=30;
		rollno[1]=20;
		rollno[2]=40;
		try
		{
		rollno[3]=50;//which ever line will give exception keep under try block
		
	}
		catch(ArrayIndexOutOfBoundsException a1)//anything that comes from java.lang no need to import
		{
			System.out.println("you exceeded the size");
		}
		catch(NullPointerException n1)
		{
			System.out.println("handled the exception called NPE");
		}
		catch(InputMismatchException i1)//java.util need to import
		{
			System.out.println("handled the exception called ime");
			
		}
		finally
		{
			System.out.println("i am finally");
		}
		
	
	}
}
