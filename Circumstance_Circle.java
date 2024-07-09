package basics.if_else;

import java.util.Scanner;

public class Circumstance_Circle {
	
static Scanner s1=new Scanner(System.in);
static void circumstance()
{
	int r=s1.nextInt();
	double pi=s1.nextDouble();
	double circumstance=2*pi*r;
	System.out.println("circumstance of the circle"+circumstance);
}
public static void main(String[] args) {
	circumstance();
}
}
