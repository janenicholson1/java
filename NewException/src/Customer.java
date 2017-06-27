
public class Customer {
	
	private int age;
	
	public Customer() {
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeOutOfBoundsException {
		if(age >= 18 && age <= 65) {
			this.age = age;
		} else {
			throw new AgeOutOfBoundsException("Age is not in range.");
		}
	}

}
