
class HSBC extends Bank
{

	@Override
	public void draw()
	{
		int A = 100;
		int B = 50;
		
		System.out.println("Amount drawn " + A);
		System.out.println("Amount drawn " + B);
		
	}
	@Override
	public void checkBalance() {
		int A = 50; 
		int B = 20;
		int C = (A-B);
		
		System.out.println("Balance " +C);
				
	} 

	@Override
	public void deposit() {
		int A = 10;
		int B = 50;
		int C = (A+B);
		
		System.out.println("Total amount deposited " + C);
	
	}

}
