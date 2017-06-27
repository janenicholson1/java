package binary;

public class binary {

	public void binarys() 
	{
		String Ans= "";
		int Num =  256;
		int Rem = 0;
				
		while (Num  >= 2)  // this the number to divide by
		{
			Rem = Num%2;
			Num= Num/2;
			Ans = Rem + Ans;
		}
			Ans = Num + Ans;
			System.out.println(Ans);
			
	}

}
