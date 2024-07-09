package collection_Program;

import java.util.*;

public class Collection_methods {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();//ArrayList inhert collection
		a1.add("Nidhi");//add is one of method in collection
		a1.add("neha");
		a1.add("abhigna");
		a1.add("nihasvi");
		a1.add("karuna");
		a1.add(32);
		a1.add(false);
		a1.add('c');
		a1.add("nidhi");//duplicate value
		a1.add(56789);
		a1.add(null);//unknown value the value which is known yet the moment we do know update thatSystem.out.println(a1);
	System.out.println(a1);
	
	ArrayList a2= new ArrayList();
	a2.addAll(a1);
	a2.add("ram");
	System.out.println(a2);
	System.out.println(a2.contains("nidhi"));
	System.out.println(a2.containsAll(a1));
	System.out.println(a2.isEmpty());
	
	ArrayList a3=new ArrayList();
	System.out.println(a3.isEmpty());
	
	
	
	

}
}
