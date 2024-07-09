package basics.if_else;

import java.util.Scanner;

public class Humaninput {
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter the value of a");
		int a=s1.nextInt();
		System.out.println("please enter the value of b");
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("the addition of a and b is->"+sum);
		
	}

}
