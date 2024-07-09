package basics.if_else;

public class MethodOverloading {
	
static void add(int a)// 1 parameter parameterized static method
{
	int sum=a+6;
	System.out.println(sum);
}
static void add(int a, int b)// 2 parameter
{
	int sum=a+b+6;
	System.out.println(sum);
}
static void add(double a)//1 parameter
{
double sum=a+6;
System.out.println(sum);
}
static void add(int a,double b,double c)//4 parameter
{
	double sum=a+b+c+6;
	System.out.println(sum);
}
public static void main(String[] args) 
{
	add(100);
	add(100,200);
	add(5.987);
	add(11,3.5,2.5);
}
}
