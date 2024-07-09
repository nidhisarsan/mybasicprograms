package stringpackage;

public class Given_noinArray {
	public static void main(String[] args) {
		
	
	
		int no[]=new int[5];
		no[0]=20;
		no[1]=48;
		no[2]=15;
		no[3]=20;
		no[4]=54;
		
		//int no[]={20,48,15,20,54};
		int no_to_check=15;
		for(int i=0;i<no.length;i++)
		{
			
		
			if(no_to_check==no[i])
			{
				System.out.println("15 is present in given array->"+i);
			}
			
			
			
				
		}
		
	}

}
