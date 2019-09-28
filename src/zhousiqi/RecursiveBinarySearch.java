package zhousiqi;
import java.util.*;

public class RecursiveBinarySearch {
	public static void main (String[] args) {
		Scanner scan =new Scanner (System.in);
		Scanner in=new Scanner(System.in);
		int[]arr=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=scan.nextInt();
		}
		int F=arr[0];
		int f=0;
		int M=arr[4];
		int m=4;
		int L=arr[9];
		int l =9;
		System.out.println("Input a number");
		int n=in.nextInt();
		while(n!=M)
		{
			if(n<M)
			{
				L=M;
				l=m;
				m=(l+f)/2;
				M=arr[m];
			}
			else
			{
				F=M;
				f=m;
				m=(l+f)/2;
				M=arr[m];
			}
		}
		System.out.println(n+"是第"+(m+1)+"个数字");
		scan.close();
		in.close();
	}

}
