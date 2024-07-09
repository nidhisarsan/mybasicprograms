package stringpackage;

public class Palindrom {
	public static void main(String[] args) {
		String name="dad";
		String reverse="";//empty
		for(int i=name.length()-1;i>=0;i--)
		{
			char c=name.charAt(i);
			reverse=reverse+c;
		}
				
		System.out.println(reverse);
		boolean a1=name.equals(reverse);
		
		if(a1==true)
		{
			System.out.println("palindrom");
		}
	}

}
