package basics.if_else;

import java.util.Scanner;

public class Scanner_Class {
	 static Scanner s1=new Scanner(System.in);
	 static void add()
	 {
	 int a=s1.nextInt();
	 int b=s1.nextInt();
	 int sum=a+b;
	 System.out.println("addition of a,b->"+sum);
	 }
	 static void sub()
	 {
	 int a=s1.nextInt();
	 int b=s1.nextInt();
	 int sub=a-b;
	 System.out.println("substraction of a,b->"+sub);
	 }
	 static void multiplication()
	 {
	 int a=s1.nextInt();
	 int b=s1.nextInt();
	 int mul=a*b;
	 System.out.println("multiplication of a,b->"+mul);
	 }
	 static void div()
	 {
	 int a=s1.nextInt();
	 int b=s1.nextInt();
	 int div=a/b;
	 System.out.println("division of a,b->"+div);
	 }
	 static void mod()
	 {
	 int a=s1.nextInt();
	 int b=s1.nextInt();
	 int mod=a%b;
	 System.out.println("addition of a,b->"+mod);
	 }
	 
	 public static void main(String[] args) {
		 add();
		 sub();
		 multiplication();
		 div();
		 mod();
	 }
		

}
