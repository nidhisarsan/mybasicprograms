package stringpackage;

public class Avarage_Array {
	static double sum=0;
	static double average=0;
	public static void main(String[] args) {
		int no[]=new int[4];
		no[0]=77;
		no[1]=72;
		no[2]=15;
		no[3]=6;
		
		//int no[]= {77,72,15,6};we can give array value like this also 
		for(int i=0;i<no.length;i++)//i<=no.length-1
		{
			 sum=sum+no[i];
			 
		}
		System.out.println("the addition of 4 numbers in array->"+sum);
		average=sum/no.length;
		System.out.println("avarage of  4 numbers in Array->"+average);
		
	}
	

}
