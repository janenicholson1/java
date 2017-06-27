
public class Switch1 {

	public static void main(String [] args) 
	{
			int A = 50;
			System.out.println(getMeString(A));
	}
	
	public static String getMeString(int x) {
			switch (x)
			{
			case 10:
			case 20:
			case 50:
				return "OMG";
			
			case 15:
			case 25:
			case 45:
				return "Ive got it";
				default:
			    return "you are the weekest link GOODBYE";
			}
			
			}
		

	}


