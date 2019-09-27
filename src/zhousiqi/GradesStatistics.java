package zhousiqi;
import java.util.*;
public class GradesStatistics {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] grade=new int [5];
		int sum=0;
		int min=100,max=0;
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter thr number of students "+ (i+1)+" :");
			grade[i]=scan.nextInt();
			sum=sum+grade[i];
			if(grade[i]<min)
			{
				min=grade[i];
			}
			if(grade[i]>max)
			{
				max=grade[i];
			}
		}
		float average=(float)sum/5;
		System.out.println("The average is:"+average);
		System.out.println("The min and the max are:"+max +","+min);
		scan.close();
		
		
		
	}

}
