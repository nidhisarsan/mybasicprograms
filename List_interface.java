package collection_Program;


import java.util.ArrayList;
import java.util.List;

public class List_interface {

	public static void main(String[] args) {
		//upcasting ArrayList to List
		List l1=new ArrayList();
		//check indexing
		l1.add(12);
		l1.add(11);
		l1.add(15);
		l1.add(20);
		System.out.println(l1);
		//Accept duplicate or not
		l1.add(11);
		System.out.println(l1);
		//accept null or not
		l1.add(null);
		System.out.println(l1);
		
		

	}

}
