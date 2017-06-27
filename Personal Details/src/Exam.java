
public class Exam 
{
	int phy, che, mat;
	float total, per;

	public void Calculate()
	{
		total = phy+che+ mat;
		per = total*100/450;
	}
	public void ShowResult()
		{
		System.out.println("Total : " + total);
		System.out.println("Per : " + per);
		}

}
