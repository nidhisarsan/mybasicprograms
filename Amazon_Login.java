package interface_program;
interface Amazon
{
	void login_emailid();
	void login_mobileno();
}
abstract class loginwith_mobile_no implements Amazon
{
	abstract void enter_orderid();
	abstract void enter_payment();
	static void enter_address()
	{
		
		String a="teachers colony";
		System.out.println("enter address"+a);
	}
	void payment_method()
	{
		String b="cod";
		System.out.println("enter payment method"+ b);
	}
}

public class Amazon_Login extends loginwith_mobile_no 
{
static void cart_items()
{
	int c=5;
	
	System.out.println("show no of items in cart"+ c);
}
void wishlist_items()
{
	int d=10;
	System.out.println("show no of items in wishlist"+ d);
}
public static void main(String[] args) {
	Amazon_Login a1=new Amazon_Login();
	a1.login_emailid();
	a1.login_mobileno();
	a1.enter_orderid();
	a1.enter_payment();
	a1.wishlist_items();
	a1.payment_method();
	cart_items();
	enter_address();
	
	
}
public void login_emailid() {
	
	System.out.println("login with email id");
}

public void login_mobileno() {
	
	System.out.println("login with mobile no");
}

void enter_orderid() {
	
	System.out.println("show order id");
}

void enter_payment() {
	
	System.out.println("show payment method");
}
}
