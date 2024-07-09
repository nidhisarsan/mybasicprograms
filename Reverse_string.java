package stringpackage;

public class Reverse_string {
	public static void main(String[] args) {
		/*String name="nidhireddy";
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));//this is one process to reverse the String but we can't use String function for this output because return type is char
	
		}*/
		String name1="my name is nidhi";//it should be in lower case or upper case
		String reverse="";
		for(int i=name1.length()-1;i>=0;i--)
		{
			char c1=name1.charAt(i);
			 reverse=reverse+c1;
			
			
		}
		System.out.println(reverse);
		
	}

}
