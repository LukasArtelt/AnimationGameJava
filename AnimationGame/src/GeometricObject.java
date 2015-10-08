//3
public class GeometricObject 
{

	public Vertex pos;
	public double high;
	public double width;
	
	public double getHight()
	{
		return high;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public Vertex getPos()
	{
		return pos;
	}

	public GeometricObject(double high, double width, Vertex pos)  //Hat jetzt alle Werte die er braucht
	{
		this.pos = pos;
		this.high = high;
		this.width = width;
		
		if (width < 0)
		{
			width = -width;
			pos.x = pos.x - width;
		}
		
		if (high < 0)
		{
			high = -high;
			pos.x = pos.x - high;
		}
	}
	
	public GeometricObject(double high, double width)
	{
		this(high, width, new Vertex(0,0));  //Hat jetzt (von unten): this(10,10, new Vertex(0,0)) und gibt diese Werte jetzt nach oben
	}
	
	public GeometricObject(double high)
	{
		this(high, high);  //Hat jetzt (von unten): this(10,10) und übergibt diese Werte jetzt an oben
	}
	
	public GeometricObject()
	{
		this(10);  //Übergibt den Wert 10 nach oben
	}
	
	public GeometricObject(Vertex pos)
	{
		this(0,0,pos);
	}
	
	// this(...) übergibt das (...) in die Methode obendrüber.
	

	public String toString()
	{
		return "width= " + width + " high= " + high + " position= " + pos;
	}
	
	public double cirumference()   // = Umfang
	{
		return 2 * (width+high);
	}

	public double area()  //Flächeninhalt
	{
		return width*high;
	}
	
	public boolean contains(Vertex v)
	{
		return v.x >= pos.x && v.x <= pos.x + width && 
				 v.y >= pos.y && v.y <= pos.y + high;
	}

	public boolean isLargerThan(GeometricObject that)
	{
		return that.area() > this.area();
	}

	public void moveTo(Vertex pos)
	{
		this.pos = pos;
	}

	public void moveTo(double x, double y)
	{
		moveTo(new Vertex(x,y));
	}
	
	public void move(Vertex v)
	{
		moveTo(pos.add(v));
	}
	
	public boolean equals(Object thatObject)
	{
		if (thatObject instanceof GeometricObject)
		{
			GeometricObject that= (GeometricObject)thatObject;
			return that.width==this.width && that.high == this.high && this.pos.equals(that.pos);
		}
		
		return false;
	}
	


}

