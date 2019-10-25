package zhousiqi2;

public class Ball {
	private double x,y,xStep,yStep;
	public Ball(double x,double y,double xStep,double yStep)
	{
		this.x=x;
		this.y=y;
		this.xStep=xStep;
		this.yStep=yStep;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public double getXStep()
	{
		return xStep;
	}
	public double getYStep()
	{
		return yStep;
	}
	public void setX(double x)
	{
		this.x=x;
	}
	public void setY(double y)
	{
		this.y=y;
	}
	public void setXStep(double xStep)
	{
		this.xStep=xStep;
	}
	public void setYStep(double yStep)
	{
		this.yStep=yStep;
	}
	public double[] getXY()
	{
		double[] XY=new double [2];
		XY[0]=this.x;
		XY[1]=this.y;
		return XY;
	}
	public void setXY(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public double[] getXYStep()
	{
		double[] XY=new double[2];
		XY[0]=xStep;
		XY[1]=yStep;
		return XY;
	}
	public void setXYStep(double xStep,double yStep)
	{
		this.xStep=xStep;
		this.yStep=yStep;
	}
	public String toString()
	{
		return "Ball@(" + x + "," + y + "),speed=(" + xStep + "," + yStep + ")";
	}
	public Ball move()
	{
		x=x+xStep;
		y=y+yStep;
		return this;
	}

}
