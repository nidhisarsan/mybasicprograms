package stringpackage;

import java.util.Arrays;

public class Deliot_stringproblm {
	public static void main(String[] args) {
		String s1="my name is manusha";
		String s2=" ";
		String s3[]=s1.split(" ");
		//System.out.println(Arrays.toString(s3));
		for(int i=0;i<s3.length;i++)
		{
			s1=s3[i].substring(0, 1);
			System.out.print(s1);
		}
		
	}

}
