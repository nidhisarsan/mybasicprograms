package try_catch;

public class Try_Catchclass {
	public static void main(String[] args) {
	try
	{
		int a=1/0;//b comes from parent class and c comes from grandparent class
		System.out.println(a);
	}
	catch(ArithmeticException b1)
	{
		System.out.println("hadled the exception");
	}

}
}