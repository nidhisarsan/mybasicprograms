package stringpackage;

import java.util.Arrays;

public class Anagram_string //same length and same characters
{
	public static void main(String[] args) {
		String a1="elbow";
		String a2="below";
		if(a1.length()!=a2.length())
		{
			System.out.println("it is not a anagram");
		}
		else
		{
			System.out.println("eligible to become anagram but need to see logic");
			char[]c1=a1.toCharArray();
			char[]c2=a2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			boolean  result=Arrays.equals(c1, c2);
			if(result==true)
			{
				System.out.println("given strings are anagram");
			}
			else
			{
				System.out.println("its not an anagram");
			}
		}
		
		
	}

}
