
public class testmyfriend {

	public static void main(String[] args) 
	{
		
		String Part;
		String Message = "Hello my friend";
	
		int i, word = 0;
		
		for (i=0; i< Message.length (); i++)
		{
			Part = Message.substring(i, i+1);
			if (Part.equals(" "))
				
				System.out.println(word+" ");
				
				else
					System.out.print(Part);
			
		}
	}

}
