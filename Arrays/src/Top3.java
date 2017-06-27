
public class Top3 
{
	int [] IntArr = new int[20];

	public static void main(String[] args) 
	{
		int [] IntArr = {47,2,340,77,43,57,90,90,90,33,32,12,120,43,22,23,45,65,8,4};
		int max1 = IntArr [0];
		int max2 = IntArr [0];
		int max3 = IntArr [0];

		for (int i = 1; i < IntArr.length; i++)
		{
			if (IntArr [i] > max1)
			{
				max2 = max1;
				max1 = IntArr [i];
			}
			if (IntArr [i] > max2 && IntArr [i] < max1)
			{
				max3 = max2;
				max2 = IntArr [i];
			}
			if (IntArr [i] > max3 && IntArr [i] < max2)
			{
				max3 = IntArr [i];
			}
		}
		System.out.println("1st Highest Number: " + max1);
		System.out.println("2nd Highest Number: " + max2);
		System.out.println("3rd Highest Number: " + max3);
	}
	
}

