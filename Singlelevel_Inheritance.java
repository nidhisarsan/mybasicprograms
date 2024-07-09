package inheritance_java;

class ParentClass
{
	static void add()
	{ int a=100;
	int b=200;
	int sum=a+b;
	System.out.println(sum);
	}
}

  public class Singlelevel_Inheritance extends ParentClass
  {
	  static void sub()
	  {
		  int a=200;
		  int b=100;
		  int sub=a-b;
		  System.out.println(sub);
		  }
	  public static void main(String[] args) {
		  sub();
		  add();
		  
		
	}
  }
	 
	

  