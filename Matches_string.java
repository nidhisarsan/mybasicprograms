package stringpackage;

public class Matches_string {
	public static void main(String[] args) {
		String s1="rama";
		boolean b1=s1.matches("....");
		System.out.println(b1);
		String s2="sahash";
		boolean b2=s2.matches("(.*)a");
		System.out.println(b2);
		System.out.println(s2.matches("a(.*)"));
		System.out.println(s2.matches("(.*)m(.*)"));
		System.out.println(s2.matches("(.*)u(.*)"));
		System.out.println(s2.matches(".r(.*)"));//. indicates single character search and (.*) indicates multi character search
		System.out.println(s2.matches("s....h"));
		
	}

}
