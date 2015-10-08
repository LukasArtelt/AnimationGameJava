//1
public class Vertex {

	public double x;  //Horizontal
	public double y;  //Vertikal
	
	public Vertex(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) 
	{
		Vertex v1 = new Vertex(42,0);
		Vertex v2 = new Vertex(0,0);
		
		//System.out.println("v1 = " + v1.toString);
		
		System.out.println("v1 = " + v1.toString());
		System.out.println("v2 = " + v2.toString());
	}
	
	public String toString()
	{
		return "(" + x + ", " + y + ")" ;
	}
	
	public double length()
	{
		return Math.sqrt(x*x + y*y);  //Vektor von Ursprung nach Vertex
	}
	
	public Vertex skalarMult(double s)
	{
		return new Vertex(x*s, y*s);  
		//neues Vertex, andere Postition weil "*s"
		//für s: siehe oben
	}
	
	public void skalarMultiMod(double s)
	{
		x = x*s;
		y = y*s;
	}
	
	/*public Vertex add(Vertex v2)  //addition zweier vertex
	{
		return new Vertex(x + v2.x, y + v2.y);
	}
	*/
	public Vertex add(Vertex v)
	{
		return new Vertex(x+v.x, y+v.y);
	}
	
	public void addMod(Vertex v2)    //addition
	{
		x = x + v2.x;
		y = y + v2.y;
	}
	
	public Vertex sub(Vertex v2)  //subtraktion
	{
		return new Vertex(x - v2.x, y - v2.y);
	}	
	
	public void subMod(Vertex v2)
	{
		x=x-v2.x;
		y=y-v2.y;
	}

	/*
	 * public double dist(Vertex va, Vertex vb)  //Distanz von 2 Vertex zueinander
	{
		double vx = va.x - vb.x ;  //x-Koordianten des Abstandsvektors berechet
		double vy = va.y - vb.y ;  //y-Koordianten des Abstandsvektors berechet
		return Math.sqrt(vx*vx + vy*vy); //Länge Abstandvektor = Abstand
	}
	*/
	
	public double distance(Vertex v2)
	{
		double xx=v2.x-this.x;
		double yy=v2.y-this.x;			
		return Math.sqrt(xx*xx+yy*yy);
	}
	
	public Vertex Norm(Vertex va)  //NormalenVektor va
	{
		va.x = va.x / va.length(); //Vektor va / Länge vektor va --> Normalenvektor von va, nur x-Wert
		va.y = va.y / va.length(); //Vektor va / Länge vektor va --> Normalenvektor von va, nur y-Wert
		return new Vertex(va.x, va.y); //Ist der Normalenvektor
	}
	
	public boolean equals(Object thatObject)
	{
		if(thatObject instanceof Vertex)
		{
			Vertex that = (Vertex)thatObject;
			return this.x==that.x && this.y == that.y;
		}
		
		return false;
	}
	    
	public double getX(){return x;}
	
	public double getY(){return y;}
	
	public void setX(double x){this.x=x;}
	
	public void setY(double y){this.y=y;}
	
	
	
	
	
	
	
}