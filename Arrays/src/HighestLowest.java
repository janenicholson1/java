/*
 Find the highest and lowest number in the array then find the top 3 
 */

public class HighestLowest 
{

	public static void main(String[] args) 
	{
		//array of 8 numbers
				int [] intArr = {23, 79, 102, 15, 42, 23, 10};
				
				//assign first element of an array to max
				int max1 =  Integer.MIN_VALUE;
				
				//int max2 = Integer.MIN_VALUE;
				int max3 = Integer.MIN_VALUE;
				
				for (int i = 1; i<intArr.length;i++)
				{
					if(intArr[i] > max1)
						max1 = intArr[i];
						
					else if(intArr[i]<max3);
						max3 = intArr[i];
						
				}
				System.out.println("Highest number is:" + max1);
				System.out.println("Lowest  number is:" + max3);
			}
						
		}