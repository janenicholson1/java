
public class Testing {

	public static void main(String x []) 
	{
		
		Words w = new Words();
		
		int Num = 9375;
		
		if (Num >=1000)
		{			
			System.out.println(w.ONES(Num/1000) + " Thousand");
			
			Num = Num - (Num/1000*1000);
		}
		if (Num >=100)
		{
			System.out.println(w.ONES(Num/100) + " Hundred");
			
			Num = Num - (Num/100*100);
		}
		if (Num >=20)
		{
			
			System.out.println(w.Ty(Num/10 * 10));
			Num = Num - (Num/10*10);
		}
		if (Num >=1)
		{
			System.out.println(w.ONES(Num));
			
			
		}
	}

}
