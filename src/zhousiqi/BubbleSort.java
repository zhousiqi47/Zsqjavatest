package zhousiqi;
import java.util.*;

public class BubbleSort {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr=new int [5];
		int j=1;
		int i=0;
		for(i=0;i<5;i++)
		{
			arr[i]=scan.nextInt();
		}
		while(j==1)
		{
			j=0;
			for(i=0;i<4;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int swap=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=swap;
					j=1;
				}
			}
		}
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		scan.close();
		
	}

}
