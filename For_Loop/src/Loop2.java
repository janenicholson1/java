
public class Loop2 {

	public void number ()
	{
			int A;
			for (A=1; A<=10; A++)
			{
				System.out.println(A);
				if (A % 2 == 0)
			{
				System.out.println ("Even");
						
				if (A > 5)
				{
				System.out.println ("-");
				}
				else
				{
					System.out.println ("*");
				}
				
			}
			else 
			{					
				System.out.println ("Odd");
				if (A > 5)
				{
					System.out.println ("!");
				}
				else
				{
					System.out.println ("?");
				}
			}
	}
	}
}	