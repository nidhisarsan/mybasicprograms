package collection_Program;

import java.util.Set;
import java.util.TreeSet;

public class Set_interface {
	public static void main(String[] args) {
		Set s1=new TreeSet();
		//check indexing
		s1.add(12);
		s1.add(11);
		s1.add(15);
		s1.add(20);
		System.out.println(s1);
		//accept duplicate or not
		s1.add(12);
		System.out.println(s1);
		//accept null or not
		s1.add(null);
		System.out.println(s1);
		
	}

}
