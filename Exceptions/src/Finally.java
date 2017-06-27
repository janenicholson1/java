
public class Finally {

	public static void main(String[] args) 
	{
		int input = 324;
		try
		{
			System.out.println("Message 1" );
			//int n = Integer.parseInt(input);
			System.out.println("Message 2" );
					
		}
		catch (NumberFormatException nfe)
		{
			System.out.println("Message 3" );
		}
		finally
		{
			System.out.println("Message 4" );
		}
		System.out.println( "Message 5" );
	}

}
