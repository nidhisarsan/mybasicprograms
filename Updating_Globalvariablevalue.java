package basics.if_else;

public class Updating_Globalvariablevalue {
	int age=10;//non static global variable
	static String name="NIDHI";//static global variable
	
	public static void main(String[] args) {
		name="Bunny";
		System.out.println(name);
		Updating_Globalvariablevalue u1=new Updating_Globalvariablevalue();
		System.out.println(u1.age);
		System.out.println(u1.age=90);
	
	}

}