package zhousiqi;

public class Fibonacci {
	public static void main (String[] args) {
		int num1=1;
		int num2=1;
		int temp;
		int sum=0;
		sum=num1+num2;
		for(int i=0;i<18;i++)
		{
			temp=num1+num2;
			num1=num2;
			num2=temp;
			sum=sum+num2;
			
		}
		System.out.println("The average is "+(double)sum/20);
	}

}
