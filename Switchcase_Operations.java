package first_program;

import java.util.Scanner;

public class Switchcase_Operations {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		switch(a)
		{
		case 1:
			int a1=2;
			int b1=3;
			int add=a1+b1;
			System.out.println(add);
			break;
		case 2:
			int a2=2;
			int b2=3;
			int sub=a2-b2;
			System.out.println(sub);
			break;
		case 3:
			int a3=2;
			int b3=3;
			int mul=a3*b3;
			System.out.println(mul);
			break;
		case 4:
			int a4=2;
			int b4=3;
			int div=a4/b4;
			System.out.println(div);
			break;
		}
		
	}

}
