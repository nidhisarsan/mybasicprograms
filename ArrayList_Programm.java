package collection_Program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Programm {
	public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("nidhi");
	a1.add("neha");
	a1.add("karuna");
	a1.add("akhila");
	System.out.println(a1);
	Iterator i1=a1.iterator();
	
			while(i1.hasNext())//true if the iteration has more elements
			{
				System.out.println(i1.next());//true if the iteration has more elements
			}
			System.out.println("+++++++++");
			ListIterator i2 =a1.listIterator();
	/*while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	System.out.println("+++++++");*/
	
	while(i2.hasPrevious())//backward is not possible without forward method
	{
		System.out.println(i2.previous());
	}

}
}
