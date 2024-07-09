package collection_Program;

import java.util.*;

public class Arraylistclass1 {
	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add("nidhi");
		a1.add("neha");
		a1.add("karuna");
		a1.add("nani");
		a1.add("neetha");
		System.out.println(a1);
		System.out.println(a1.indexOf("nani"));//indexof() method
		System.out.println(a1.get(3));//get() method		
		a1.set(3, "nalini");//set() method
		System.out.println(a1);
		
		
		
	}

}
