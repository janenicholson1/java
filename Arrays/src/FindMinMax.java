
public class FindMinMax 
{

	public static void main(String[] args) 
	{
		//array of 6 numbers
		int num[] = new int[]{15,10,5,95,62,101,36};
		
		MinMaxSort mms = new MinMaxSort();
		
		if(mms instanceof Sortable)
			mms.sort(num);
		else 
			System.out.println("Not part of sortable");
	}


	

}