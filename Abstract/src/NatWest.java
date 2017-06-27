
class NatWest extends Bank {

	@Override
	public void draw()
	{
		int A = 200;
		int B = 100;
		int C = (A+B);
		 
		System.out.println("Amount drawn " + C);
		
	}
	@Override
	public void checkBalance() 
	{
		int A = 150; 
		int B = 120;
		int C = (A-B);
		
		System.out.println("Balance " +  C);
	}

	@Override 
	public void deposit() 
	{
		int A = 110;
		int B = 150;
		int C = (A+B);
		
		System.out.println("Balance " +  C);
	}

}
