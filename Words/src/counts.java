
public class counts 
{

	public static void main(String[] args) 
	{
	  String name = "I am going to Newport I am";
	  String search = "am"; 
	  int index = 0;
	  int count = 0;
	  String pos = "";
	  while(index != -1)
	  	{	
		  index = name.indexOf(search,index);
		  
		  if(index != -1)
		  	{
			  count ++;
			  pos += (index+1) + ", ";
			  index += search.length();
			 }
			  
	  }
			  			 
		 		 System.out.println("Searching for the word: " + search);
		 		 System.out.println("Number of occurances: " + count);
		 		 System.out.println("Position number of word: " + pos);


	  }
}
	
