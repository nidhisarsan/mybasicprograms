package inheritance_java;

public class This_Calling 

{
	
This_Calling(int a)
{
	System.out.println(1);
}
This_Calling(double b)
{
	this(5789543);
	System.out.println(2);
}
This_Calling(String c)
{
	this(23.789);
	System.out.println(3);
}
public static void main(String[] args) {
	This_Calling t1=new This_Calling("Nidhi");
	
	
}
}
