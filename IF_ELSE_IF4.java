package basics.if_else;

public class IF_ELSE_IF4 {
	public static void main (String[]args) 
	{
		int no1=10;
		int no2=20;
		int no3=30;
		if(no1>no2)//false
		{
			System.out.println("1");
		}
		else if(no2>50)//false
		{
			System.out.println("2");
		}
		else if(no3>100)//false
		{
			System.out.println("3");
			
		}
		else if(no3<no1)//false
		{
			System.out.println("4");
		}
		else if(no2<no3)//true
		{
			System.out.println("5");
		}
		else
		{
			System.out.println("@");
		}
	}
}
			
			
	
			
	


