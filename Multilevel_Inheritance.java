package inheritance_java;

class Chenni
{
   void add()
{
	int a=2;
	int b=3;
	int sum=a+b;
	System.out.println(sum);
}
}
class Hyderabad extends Chenni
{
 void sub()
{
	int a=2;
	int b=3;
	int sub=a-b;
	System.out.println(sub); 
}
}
public class Multilevel_Inheritance extends Hyderabad
{
	void mod()
	{
		int a=2;
		int b=3;
		int mod=a%b;
		System.out.println(mod);
	}
	public static void main(String[] args) 
	{
Multilevel_Inheritance m1=new Multilevel_Inheritance();
m1.add();
m1.sub();
m1.mod();

}
}






























