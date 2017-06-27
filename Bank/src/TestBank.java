
public class TestBank 
{
public static void main(String [] args)
	{
	Bank HSBC, Barclays, NatWest, Halifax;
	
	HSBC = Bank.xyz();
	Barclays = Bank.xyz();
	NatWest = Bank.xyz();
	Halifax = Bank.xyz();
		
	
	HSBC.A = 75;
	HSBC.ConvertMoney(100);
	System.out.println("HSBC " + HSBC.A);
	
	Barclays.A = 85;
	Barclays.ConvertMoney(50);
	System.out.println("Barclays " + Barclays.A);
	
	NatWest.A = 95;
	NatWest.ConvertMoney(20);
	System.out.println("NatWest " + NatWest.A);
	
	Halifax.A = 105;
	Halifax.ConvertMoney(200);
	System.out.println("Halifax " + Halifax.A);
		
	}

}
