package basics.if_else;

public class Global_Methods5 {
	static int a=2;
	static int b=4;
	static void add()
	{
		int c=6;
		int sum=a+b+c;
		int sub=c-b;
		int mul=a*c;
		int div=c/a;
		int mod=c%a;
		System.out.println(sum);
		
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
     }
	public static void main(String[] args) {
		int d=10;
		int sum=a+b+d;
		int sub=d-b;
		int mul=a*d;
		int div=d/a;
		int mod=d%a;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
		add();
	}
	
}
