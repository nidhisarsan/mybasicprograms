package stringpackage;

import java.util.Arrays;

public class Numeric_Letters {
	static int count_of_digits=0;
	public static void main(String[] args) {
		String name="nidhi1234";
		char[] c1=name.toCharArray();
		
		//System.out.println(Arrays.toString(c1));
		for(int i=0;i<name.length();i++)
		{
		boolean b1=Character.isDigit(c1[i]);
	//System.out.println(b1);	
		
		if(b1==true) {
			count_of_digits++;
		}
		}
		System.out.println("no of digits in given string->" +count_of_digits);
		
	}

}


