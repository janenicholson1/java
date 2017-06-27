
public class errorHandling 
{

	public static void main(String[] args) 
		{
		int a = 4;
		int b = 0;
		int c;
	
		try
		{ 
			c= a/b;
			System.out.println("All's good in the world. " + a + "/" + b + "=" + c);
		}
		catch(ArithmeticException x)
		{
			System.out.println("No chance. " + a + " cannot divide by " + b);
		}

		}
}