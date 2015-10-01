//3
public class GeometricObject {

	public Vertex pos;
	public double high;
	public double with;
	
	public double getHight()
	{
		return high;
	}
	
	public double getWith()
	{
		return with;
	}
	
	public Vertex getPos()
	{
		return pos;
	}

	public GeometricObject(double high, double with, Vertex pos)
	{
		this.pos = pos;
		this.high = high;
		this.with = with;
		
		if (with < 0)
		{
			with = -with;
			pos.x = pos.x - with;
		}
		
		if (high < 0)
		{
			high = -high;
			pos.x = pos.x - high;
		}
	}
	
	
	
}
