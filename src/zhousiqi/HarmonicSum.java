package zhousiqi;

public class HarmonicSum {
	 public static void main(String[] args) {
		 double i=0;
		 double upper=10;
		 double lower=1;
		 double sum=1;
		 for(i=lower;i<=upper;i++)
		 {
			 sum=sum+1/i;
		 }
		 System.out.println("The harmonic sum is "+sum);
	 }

}