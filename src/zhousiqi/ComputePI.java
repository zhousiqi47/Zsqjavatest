package zhousiqi;

public class ComputePI {
	 public static void main(String[] args) {
		 double i=1;
		 int j=1;
		 double PI=0;
		 double upper=100000;
		 for(i=1;i<=upper;i=i+2,j++)
		 {
			 if(j%2==0)
			 {
				 PI=PI-1/i;
			 }
			 else
			 {
				 PI=PI+1/i;
			 }
		 }
		 PI=4*PI;
		 System.out.println("Pi is "+PI);
	 }

}
