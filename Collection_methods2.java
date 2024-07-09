package collection_Program;

import java.util.*;//in place of ArrayList we can put * symbol also

public class Collection_methods2 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("nalini");
		a1.add("nani");
		a1.add("sneha");
        a1.add("leena");
        System.out.println("the size of a1->" +a1.size());
        System.out.println("before removal->"+a1);
        a1.remove("nani");
        System.out.println("after removal->"+a1);
        ArrayList a2=new ArrayList();
        a2.addAll(a1);
        a2.add("nidhi");
        a2.removeAll(a1);
        
        System.out.println("after removing all->" +a2);
        ArrayList a3=new ArrayList();
        a3.add("1");
        a3.add("2");
        a3.add("78");
        System.out.println(a3);
        a3.clear();
        System.out.println(a3);
        
        
	}

}

