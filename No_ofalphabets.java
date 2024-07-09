package stringpackage;

import java.util.Arrays;

public class No_ofalphabets {
	static int count_of_alphabets=0;
	static int count_of_spaces=0;
	static int count_of_specialcharacters=0;
	public static void main(String[] args) {
		
		String s1="salary of ram is 2000@#$";
		char [] c1=s1.toCharArray();
		//System.out.println(Arrays.toString(c1));
		for(int i=0;i<s1.length();i++) {
			
		
		boolean b2=Character.isLetter(c1[i]);
		//System.out.println(b2);
		if(b2==true)
		{
			count_of_alphabets++;
			
		}
		boolean b3=Character.isSpaceChar(c1[i]);
		if(b3==true) {
			count_of_spaces++;
		}
		
		
	
		
		}
		System.out.println("no of alaphabets in given string->"+count_of_alphabets);
		System.out.println("no of spaces in given string->"+count_of_spaces);
		
		
		}
	}
	


