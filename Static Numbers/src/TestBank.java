
public class TestBank {

	public static void main(String[] args) {

		Bank HSBC, NatWest;
		HSBC = new Bank();
		NatWest = new Bank();
		
		HSBC.setDollar(1);
		NatWest.dollarRate();
		NatWest.setDollar (80);
		HSBC.convertMoney(50);
		NatWest.convertMoney(100);
	}

}
