package inheritance_java;
class Set_Url
{
	Set_Url()
	{
		System.out.println("Set_Url");
	}
}
class Lunch_the_browser extends Set_Url
{
	Lunch_the_browser()
	{
		System.out.println("Lunch_the_browser");
	}
}

public class Testcase_1 extends Lunch_the_browser
{
	Testcase_1()
	{
		super();//it can be present implicitly or explicitly
	System.out.println("Testcase_1");
	}
public static void main(String[] args) 
{
	Testcase_1 t1=new Testcase_1();
	
}
}
