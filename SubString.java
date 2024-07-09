package stringpackage;

public class SubString {

	public static void main(String[] args) {
		String a1="i bought a home";
		System.out.println(a1.substring(3));//single parameter substring
System.out.println(a1.substring(2, 5));//double parameter substring
System.out.println(a1.substring(3, 8));//it will start at index 3 end at index (8-1)
String a2="manish kumar tiwari";
String name=a2.substring(7, 12);
System.out.println(name);                                                                        

	}

}
