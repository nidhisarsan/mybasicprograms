package stringpackage;

import java.util.Arrays;

public class String_Split {
	public static void main(String[] args) {
		String s1="my name is nidhi";
		String s2[]=s1.split(" " );//to convert string into array we do use split string function
		//s2[0]=my
		//s2[1]=name
	    //s2[2]=is
		//s2[3]=nidhi
		//sysout.out.println(s2[0]);
		System.out.println(Arrays.toString(s2));
		String s3[]=s1.split(" ", 3);//it will split in to the limit
		System.out.println(Arrays.toString(s3));
	}

}
