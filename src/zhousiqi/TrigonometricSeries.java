package zhousiqi;
import java.util.*;
public class TrigonometricSeries {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		double x=in.nextDouble();
		double s;
		double c;
		s=sin(x,19);
		c=cos(x,1000);
		System.out.print("The sinx is "+s+",the cosx is "+c);
	    in.close();
	}
	public static double sin(double x,int numTerms) {
		double s=0;
		double X=1,Y=1;
		for(int i=0;i<numTerms;i++)
		{
			for(int j=0;j<2*i-1;j++)
			{
				X=x*X;
			}
			for(int k=1;k<=2*i-1;k++)
			{
				Y=Y*k;
			}
			if(i%2==0)
			{
				s=s-X/Y;
			}
			else
			{
				s=s+X/Y;
			}
		}
		return s;
	}
	public static double cos(double x,int numTerms) {
		double c=0;
		double X=1,Y=1;
		for(int i=0;i<numTerms;i++)
		{
			for(int j=0;j<2*i;j++)
			{
				X=x*X;
			}
			for(int k=1;k<=2*i;k++)
			{
				Y=Y*k;
			}
			if(i%2==0)
			{
				c=c-X/Y;
			}
			else
			{
				c=c+X/Y;
			}
		}
		return c;
	}
}
