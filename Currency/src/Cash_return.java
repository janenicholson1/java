
public class Cash_return {

	public static void main(String[] args) {
		double due, paid, balance;
		int cash50, cash20, cash10, cash5, cash2, cash1, cash050, cash020, cash010, cash05,cash02, cash01;
		due = 0.01;
		paid = 1;
		
		balance = paid - due;
		System.out.println("Balance is " + "£" + balance);
		
		if (balance >= 50)
		{
			cash50 = (int) (balance/50);
			balance = balance -(cash50*50);
			System.out.println("£50:" + cash50);
	
		}
				
		if (balance >= 20)
		{
			cash20 = (int) (balance/20);
			balance = balance -(cash20*20);
			System.out.println("£20:" + cash20);
	
		}
		if (balance >= 10)
		{
			cash10 = (int) (balance/10);
			balance = balance - (cash10*10);
			System.out.println("£10:" + cash10);
	
		}
		if (balance >= 5)
		{
			cash5 = (int) (balance/5);
			balance = balance - (cash5*5);
			System.out.println("£5:" + cash5);
	
		}
		if (balance >= 2)
		{
			cash2 = (int) (balance/2);
			balance = balance - (cash2*2);
			System.out.println("£2:" + cash2);
	
		}
		if (balance >= 1)
		{
			cash1 = (int) (balance/1);
			balance = balance -(cash1*1);
			System.out.println("£1:" + cash1);
	
		}
		if (balance >= 0.50)
		{
			cash050 = (int) (balance/0.5);
			balance = balance -(cash050*0.5);
			System.out.println("£0.50:" + cash050);
	
		}
		if (balance >= 0.20)
		{
			cash020 = (int) (balance/0.2);
			balance = balance -(cash020*0.2);
			System.out.println("£0.20:" + cash020);
	
		}
		if (balance >= 0.10)
		{
			cash010 = (int) (balance/0.1);
			balance = balance -(cash010*0.1);
			System.out.println("£0.10:" + cash010);
	
		}
		if (balance >= 0.05)
		{
			cash05 = (int) (balance/0.05);
			balance = balance -(cash05*0.05);
			System.out.println("£0.05:" + cash05);
	
		}
		if (balance >= 0.02)
		{
			cash02 = (int) (balance/0.02);
			balance = balance -(cash02*0.02);
			System.out.println("£0.02:" + cash02);
	
		}
		if (balance >= 0.01)
		{
			cash01 = (int) (balance/0.01);
			balance = balance -(cash01*0.01);
			System.out.println("£0.01:" + cash01);
	
		}
	}

}
