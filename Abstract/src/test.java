
public class test 
{
	
	public static void main (String [] args)
	{
		HSBC H = new HSBC ();
		System.out.println("----------");
		System.out.println("HSBC ");
		Banking(H);
		
		NatWest N = new NatWest ();
		System.out.println("----------");
		System.out.println("NatWest ");
		Banking(N);
		
	}


	public static void Banking (Bank x)
	{
 	x.deposit();
 	x.draw();
 	x.checkBalance();
	}
}	