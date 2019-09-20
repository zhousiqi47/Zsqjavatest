package zhousiqi;

public class ExtractDigits {
	public static void main (String[] args) {
		int num=52469;
		int i=num%10;
		int j=10;
		int temp=0;
		while(i!=0)
		{
			System.out.print(i+" ");
			j=j*10;
			temp=temp+i;
			i=(num%j-temp)/(j/10);
			//System.out.print(i+" "+j);
		}
		
	}

}
