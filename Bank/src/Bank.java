
class Bank 
{
	int A;
	static Bank R;
	static int count = 0;

	public void MSG ()
	{
		System.out.println("Hello");
	}
	private Bank ()
	{
		
	}
	public static Bank xyz()
	{
		if(count < 3)
		
		{
			R = new Bank();
			count = count+1;
			
			return R;
		}
		else
			System.out.println("Oops you can't create any more!");	
			return null;
	}	
	static int Dollar;
	static
	{
		Dollar = 10+1+15;
	}
	
	public void SetDollar (int A)
	{
	Dollar = A;
	}
	public void ConvertMoney (int A)
	{
		System.out.println( Dollar*A);
	}
}

