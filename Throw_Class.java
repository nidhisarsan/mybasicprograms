package throw_programm;

public class Throw_Class 
{
	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		System.out.println("Nidhi");
		
		Thread.sleep(5000);
		
		
		throw new NullPointerException("sorry the cell is empty");
	}

}
