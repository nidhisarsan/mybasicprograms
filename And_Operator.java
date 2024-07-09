package basics.if_else;

public class And_Operator {
	public static void main(String[] args) {
		int age=20;
		int salary=10000;
		if(age==18 && salary==1000)//c1 false
		{
			System.out.println("i will execute if both are true");
		}
		if(age==18 && salary==2000)//c1 false
		{
			System.out.println("i will execute if both are true");
			
		}
		if(age==20 && salary==1000)//c2 false
		{
			System.out.println("i will execute if both are true");
		}
		if(age==20 && salary==10000)//c1 true,c2 true
		{
			System.out.println("i will execute if both are true");
		}
	}

}


