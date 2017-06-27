
public class Division 
{
	public static void main(String [] args) 
	{
		int A, B, C;
		A=B=C=0;
		try
		{
			A = Integer.parseInt(args[0]);
			B = Integer.parseInt(args[1]);
			C = A/B;
			System.out.println("The Result: " + C);
		}
		catch (NumberFormatException x)
		{
			System.out.println("Please use only numeric values ");
		}
		catch (ArithmeticException y)
		{
			System.out.println("Cannot divide anything by zero ");
		}
		catch (ArrayIndexOutOfBoundsException z)
		{
			System.out.println("Please provide 2 values ");
		}
		//Always place this exception at the end otherwise it will prevent the specific exceptions running
		//catch (Exception Z)
		//{
		//	System.out.println("There is a problem with your code");
		//}
	}

}