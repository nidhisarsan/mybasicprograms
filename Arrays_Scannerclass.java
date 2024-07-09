package stringpackage;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Scannerclass {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int rollno[]=new int[5];
		for(int i=0;i<rollno.length;i++)
		{
			rollno[i]=s1.nextInt();
		}
		
		
		System.out.println(Arrays.toString(rollno));
		
	}

}
