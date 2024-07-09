package interface_program;
interface Amazon
{
	void login_with_emial_id();//abstract method
	void login_with_mobile_no();// abstract method
}


public class Grotechminds implements Amazon
{
public static void main(String[] args) 
{
	Grotechminds g1=new Grotechminds();
	g1.login_with_emial_id();
	g1.login_with_mobile_no();
}
	
	public void login_with_emial_id() 
	{
		
		System.out.println("keep the real logic");
	}

	
	public void login_with_mobile_no() 
	{
		System.out.println("keep the real logic ");
		
	}

}
