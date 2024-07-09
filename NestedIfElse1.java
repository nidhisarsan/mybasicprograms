package basics.if_else;

public class NestedIfElse1 {
	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=200;
		if(a<b)//true
		{
			if(b<c)//false
			{
			System.out.println("a is greater and b is greater");
			}
			else
			{
			System.out.println("a is smaller and b is smaller");
			}
		}
		else
		{
			System.out.println("else statement");
			
		}
	}
}
		

