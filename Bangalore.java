package collection_Program;
class Delhi//parent class
{
	void vehicle() {
		
	}
	void busses()
	{
		
	}
}

public class Bangalore extends Delhi//child class
{
	void add()	                                        
	{
		
	}
	public static void main(String[] args) {
		Delhi d1=new Bangalore();//upcasting
		d1.vehicle();
		d1.busses();
		/*Bangalore b1=new Bangalore();//to call own methods present in class
		 
			b1.add();*/	
		
		
		
	}

}
