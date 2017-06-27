
public class MinMaxSort implements Sortable {

	public void sort(int[] num) {
		//assign first element of an array to max and min
		int min = num[0];
		int max = num[0];

		for(int i=1; i< num.length; i++)
		{
			if(num[i] > max)
				max = num[i];
			else if (num[i] < min)
				min = num[i];
		}
		System.out.println("Largest number is: " + max);
		System.out.println("Smallest number is: " + min);
	}

	@Override
	public void sort(String[] word) {
		// TODO Auto-generated method stub
		
	}
	
}
