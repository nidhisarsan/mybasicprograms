package stringpackage;

import java.util.Arrays;

public class Revers_Array {
	static int k=0;
	public static void main(String[] args) {
		int no[]=new int[4];
		no[0]=12;
		no[1]=13;
		no[2]=14;
		no[3]=15;
		//int no[]={12,13,14,15};
		int no_reverse[]=new int[no.length];
		for(int i=no.length-1;i>=0;i--)
		{
			 
			
			no_reverse[k]=no[i];
			k++;
			
		}
		System.out.println(Arrays.toString(no));
		System.out.println(Arrays.toString(no_reverse));
		
	}

}
