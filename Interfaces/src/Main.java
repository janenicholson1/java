
public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		Plane p = new Plane();
		Boat b = new Boat();
		peddle(b);
	}
	
	public static void peddle(Peddlable p) {
		p.pressPeddle();
	}
	
}
