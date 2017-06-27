package this_Cons;

public class QA 
{

	public QA () 
	{
		System.out.println("A");
	}
	public QA (int A)
	{
			
		System.out.println(A);
	}
	public QA (int A, int B)
	{
		this(5);
		System.out.println("C");
	}
	
}
