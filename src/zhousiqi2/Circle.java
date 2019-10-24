package zhousiqi2;

public class Circle {
	public double radius;    
	private String color;        
	public Circle() {
	    radius = 1.0;
	    color = "red";    
	}    
	public Circle(double radius) {                  
		this.radius = radius;       
		color = "red";    
	}    
	public Circle(double r, String c) {       
		radius = r;       
		color = c;    
	}     
	public String toString()
	{
		return "Circle[radius=" + radius + ",color=" + color + "]"; 
	}
	public void setColor(String newColor)
	{
		color=newColor;
	}
	public double getRadius() {       
		return radius;    
	}    
	public String getColor() {       
		return color;    
	}    
	public double getArea() {       
		return radius * radius * Math.PI;    
		}
	}