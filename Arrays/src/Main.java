import java.util.Arrays;

public class Main 
{

	//static int[] intArr = new int[5];
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*intArr[4] = 4567;
		intArr[3] = 1234;
		intArr[2] = 1111;
		intArr[1] = 2222;
		intArr[0] = 1122; */
		
		int[] intArr = {1122, 2222, 1111, 1234, 4567};
		
		for(int i = 0; i < intArr.length; i ++) 
		{
			System.out.println("[" + i + "]" + intArr[i]);
		}
		Arrays.sort(intArr);
		System.out.println();
		for(int i = 0; i < intArr.length; i ++) 
		{
			System.out.println("[" + i + "]" + intArr[i]);
		}
	}

}
