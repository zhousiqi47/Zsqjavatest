package zhousiqi2;


public class CircleTest {
	 public static void main(String[] args) {
	    Circle c1=new Circle();
	    Circle c2=new Circle(2.0);
	    Circle c3=new Circle(3.0,"blue");
	    c2.setColor("yellow");
	    System.out.println(c1.getArea()+" "+c1.getRadius()+" "+c1.getColor());
	    System.out.println(c2.getArea()+" "+c2.getRadius()+" "+c2.getColor());
	    System.out.println(c3.getArea()+" "+c3.getRadius()+" "+c3.getColor());
	    System.out.println(c1.radius);
	    
	    System.out.println(c1.toString());
	    System.out.println(c1);
	    System.out.println("c1 is:"+c1);
	 }
}