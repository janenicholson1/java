
public class TestCircle 
{	

	public static void main(String[] args) 
	{
		Circle C = new Circle();
		doDrawing(C);
		Line L = new Line();
		doDrawing(L);
	}

	static public void doDrawing(Draw x) 
	{
		
		x.Drawing();
	}

}
