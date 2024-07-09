package stringpackage;

import java.util.Arrays;

public class copy_Array {
	public static void main(String[] args) 
	{
		 int no[]=new int[5];
		 no[0]=12;
		 no[1]=13;
		 no[2]=14;
		 no[3]=15;
		 no[4]=16;
				 
		 int no_copied[]=new int[no.length];//5
		 for(int i=0;i<no.length;i++)
		 {
			 no_copied[i]=no[i];
		 }
		 System.out.println(Arrays.toString(no));
		
		System.out.println(Arrays.toString(no_copied));
		boolean b1=Arrays.equals(no, no_copied);
		System.out.println(b1);

}
}