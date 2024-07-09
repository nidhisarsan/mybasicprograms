package first_program;

public class Add_Sub_Mul_Div_Mod {
		static void add()
		{
			int a=2;//local variable
			int b=4;
			int sum=a+b;
			System.out.println(sum);
			
		}
		static void sub()
		{
			int a=4;
			int b=2;
			int sub=a-b;
		    System.out.println(sub);
		}
		static void mul()
		{
			int a=2;
			int b=4;
			int mul=a*b;
			System.out.println(mul);
		}
		static void div()
		{
			int a=20;
			int b=4;
			int div=a/b;
			System.out.println(div);
		}
		static void mod()
		{
			int a=20;
			int b=4;
			int mod=a%b;
			System.out.println(mod);
			}
		public static void main(String[] args) {
			
			add();
			sub();
			mul();
			div();
			mod();
				
		}
}

