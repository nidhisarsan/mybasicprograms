package interface_program;
interface Email_id
{
	void email_as_un();
	
	
}
interface mobile_no
{
	void mobile_no_as_un();
}

public class Facebook_Login implements mobile_no, Email_id 
{
public static void main(String[] args) {
	Facebook_Login f1=new Facebook_Login();
	f1.email_as_un();
	f1.mobile_no_as_un();
	
}
	
	public void email_as_un() 
	{
		
		System.out.println("login with email id" );
	}

	
	public void mobile_no_as_un() 
	{
		System.out.println("login with mobile no");
		
	}

}
