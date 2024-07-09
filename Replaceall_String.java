package stringpackage;

public class Replaceall_String {
	public static void main(String[] args) {
		String name="rama";
	String name1	=name.replaceAll("a", "");//replace with nothing
	System.out.println(name1);//remove all a
	System.out.println(name.replaceAll("a", "r"));
	String name2="   my name is nidhi ";
	System.out.println(name2.replaceAll(" ", ""));
	String s1="NIdhi";
	System.out.println(s1.replaceAll("[A-Z]", ""));
	System.out.println(s1.replaceAll("[a-z]", ""));
		String s2="Nihasvi no is 123";
		System.out.println(s2.replaceAll("[0-9]", ""));
		
	}

}
