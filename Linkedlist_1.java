package collection_Program;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist_1 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("nidhi");
		l1.add("neha");
		l1.add("karuna");
		l1.add("nani");
		l1.add("neetha");
		l1.add(12);
		l1.add('b');
		l1.add("null");
		System.out.println(l1);//it is following indexing
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("*****");
		ListIterator i2=l1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("*******");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		System.out.println("*******");
		
		l1.addFirst("gana");
		l1.addLast(89);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		
	}

}
