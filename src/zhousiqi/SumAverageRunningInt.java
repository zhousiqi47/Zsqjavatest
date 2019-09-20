package zhousiqi;

public class SumAverageRunningInt {
	 public static void main(String[] args) {
		 int sum=0;
		 int low=1;
		 int upper=100;
		 int i=0;
		 double ave=0;
		 for(i=low;i<=upper;i++)
		 {
			 sum =sum+i;
		 }
		 ave=(double)sum/upper;
		 System.out.println("The sum is "+sum+" and the average is"+ave);
	 }

}
