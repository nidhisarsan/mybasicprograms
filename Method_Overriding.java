package inheritance_java;
class Parent_Method
{
	void login()
	{
		System.out.println("login with mobile number");
	}
}



public class Method_Overriding extends Parent_Method
{
	void login()
	{
		
	
		System.out.println("login with email id");
		super.login();
	}
	public static void main(String[] args) 
	{
		Method_Overriding m1=new Method_Overriding();
		m1.login();
		
	}
	

}
