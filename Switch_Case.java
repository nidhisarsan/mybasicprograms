package first_program;

import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		System.out.println("choose which browser to launch");
		System.out.println("remember 1 for chrome, 2 for firefox, 3 for safari, 4 for edge");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("launching chrome browser");
			break;
		case 2:
			System.out.println("launching firefox browser");
			break;
		case 3:
			System.out.println("launching safari browser");
			break;
		case 4:
			System.out.println("launching edge browser");
			break;
			
			
			
		}
		
		
		
	}
	

}
