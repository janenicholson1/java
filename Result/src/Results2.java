
public class Results2 
{

	private int phy, che, mat, total;
	private float per;
	private int invalid;
	private int modulesFailed;	    
	
	public void showresults ()
	
		    {
			
				if (invalid !=1)
				{
				    System.out.println("totalscore: " + total);
				    System.out.println("percentage: " + per );
				}     
				  if (modulesFailed == 1)
				  {
				      System.out.println("Retake the Exam");
				  }		 
				     else if (modulesFailed == 2)
				     {
				    	System.out.println("Please repeat the course");
				     }
				     else if (modulesFailed == 3)
				     {
				    	 System.out.println("Go Home!");
				     }
				}
	
    public void physics (int A)
    {
    	if (A>= 0 && A<= 150)
    	{
    		phy = A;
    		if (A<70)
    		{
    			System.out.println("Failed Physics");
    			modulesFailed ++;
    		}
    	}
     
    	else
    	{
    		System.out.println("Sorry, invalid value for physics");
    		invalid=1;
    	}
   	
    }
      
    public void chemistry (int B)
    {
    	if (B>= 0 && B<= 150)
    	{
    		che = B;
    		if (B<70)
    		{
    			System.out.println("Failed Chemistry");
    			modulesFailed ++;
    		}
    	}
     
    	else
    	{
    		System.out.println("Sorry, invalid value for chemistrys");
    		invalid=1;
    	}
   	
    }
    public void maths (int C)
    {
    	if (C>= 0 && C<= 150)
    	{
    		mat = C;
    		if (C<70)
    		{
    			System.out.println("Failed Maths");
    			modulesFailed ++;
    		}
    	}
     
    	else
    	{
    		System.out.println("Sorry, invalid value for Maths");
    		invalid=1;
    	}
   	
    }

   public void calculating ()
    {
	 total  = phy + che + mat;
	per = (float) total * 100/450;
    }
}