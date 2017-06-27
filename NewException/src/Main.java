
public class Main {

	public static void main(String[] args) {
		Customer cust = new Customer();
		
		try {
			cust.setAge(28);
		} catch (AgeOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Ah... finally.");
		}
		
		System.out.println(cust.getAge());
	}

}
