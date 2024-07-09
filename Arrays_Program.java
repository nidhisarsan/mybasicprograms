package stringpackage;

import java.util.Arrays;

public class Arrays_Program {
	public static void main(String[] args) {
		
		int rollno[]=new int[5];
		rollno[0]=91;
		rollno[1]=1;
		rollno[2]=56;
		rollno[3]=22;
		rollno[4]=33;
		/*for(int i=0;i<=4;i++)
		{
			System.out.println(rollno[i]);
		}*/
		System.out.println(Arrays.toString(rollno));
		//lets do a problem to store 5 names together
		String name[]=new String[5];
		name[0]="nidhi";
		name[1]="kalki";
		name[2]="nandu";
		name[3]="nani";
		name[4]="neha";
		System.out.println(Arrays.toString(name));
		
		
		
	}

}
