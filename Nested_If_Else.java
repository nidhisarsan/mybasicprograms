package basics.if_else;

public class Nested_If_Else {
public static void main(String[]args) {
	int no1=10;
	int no2=20;
	if (no1<no2)// True
	{
		if(no1>100)//False
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("2");
		}
	}
	else
	{
		System.out.println("3");
	}
}
}
