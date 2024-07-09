package basics.if_else;

public class NOT_Operator {
	public static void main(String[] args) {
		int age=20;
		int salary=10000;
		if(!(age==18 && salary==1000))//false
		{
			System.out.println("i will execute if both are true");
		}
		if(!(age==18 && salary==2000))//false
		{
			System.out.println("i will execute if both are true");
			
		}
		if(!(age==20 && salary==1000))//fasle
		{
			System.out.println("i will execute if both are true");
		}
		if(!(age==20 && salary==10000))//true
		{
			System.out.println("i will execute if both are true");
		}
		
	}

}
