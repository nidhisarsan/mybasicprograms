package inheritance_java;
class ParentClass
{
	 void add()
	{ int a=100;
	int b=200;
	int sum=a+b;
	System.out.println(sum);
	}
		  
    public class Single_Inheritance1 extends ParentClass 
    {
			 void sub()
			  {
				  int a=200;
				  int b=100;
				  int sub=a-b;
				  System.out.println(sub);
				  }
			 public static void main(String[] args) {
				 Single_Inheritance1 s1= new Single_Inheritance1();
				 s1.sub();
				 s1.add();
				
			}
			
		}

}
