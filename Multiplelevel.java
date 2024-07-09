package interface_program;
interface addition
{
	void add();
	void sub();
}

class multiplication  
{
	static int a=2;
	static int b=3;
	
	static void mul() {
		
		 int mul=a*b;
		System.out.println(mul);
	}

	
	public void add() {
		int sum=a+b;
		System.out.println(sum);
		
		
	}

	
	public void sub() {
	
		int subtraction=a-b;
		System.out.println(subtraction);
	}
	
}



public class Multiplelevel extends multiplication implements addition
{
	
	public static void main(String[] args) {
		Multiplelevel m1=new Multiplelevel();
		m1.add();
		m1.sub();
		mul();
	}
}

