package zhousiqi2;

public class Point {
	private int x,y;
	Point()
	{
		x=0;
		y=0;
	}
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	public void setX(int x)
	{
		this.x=x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public String toString()
	{
		return String.format ("(%d,%d)",x,y);
	}
	public int[] getXY()
	{
		int[] results =new int[2];
		results[0]=this.x;
		results[1]=this.y;
		return results;
	}
	public void setXY(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public double distance(int x,int y)
	{
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}
	public double distance(Point p)
	{
		return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
	}
	public double distance()
	{
		return Math.sqrt(x*x+y*y);
	}
	

}
