package zhousiqi2;

public class TestOverLoading {
	public static int average(int a,int b)
	{
		System.out.println("Run version A");
		return (a+b)/2;
	}
	public static double average(double a,double b)
	{
		System.out.println("Run version B");
		return (a+b)/2;
	}
	 public static void main(String[] args) {       
		 System.out.println(average(1, 2));
		 System.out.println(average(1.0, 2.0)); 
	 }

}
