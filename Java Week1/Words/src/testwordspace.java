
class testwordspace {

	public static void main(String[] args) 
	{
		String Part;
		String  x = "I am in Newport";
		int i, word = 0;
		
		for (i=0; i < x.length(); i ++)
		{
			Part = x.substring(i,i+1);
			
			if (Part.equals(" ")) 
				word++;
			
		}
		System.out.print(word+1);
	}

}
