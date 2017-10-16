public class Point
{
	// these are fields
	private int x;
	private int y;

	public Point ()
	{
		this(0,0);
	}

	public Point (int initialX, int initialY)
	{
		x = initialX;
		y = initialY;
	}

	public double distanceFromOrigin ()
	{
		return Math.sqrt (x * x + y * y);
	}

	public int getX ()
	{
		return x;
	}

	public int getY ()
	{
		return y;
	}

	public void setLocation (int newX, int newY)
	{
		x = newX;
		y = newY;
	}

	public void translate (int dx, int dy)
	{
		x = x + dx;
		y = y + dy;
	}

	public String toString ()
	{
		return "[" + x + "," + y + "]";
	}
}

