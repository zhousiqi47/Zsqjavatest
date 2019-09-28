package zhousiqi;

import java.util.Scanner;

public class SelectionSort {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr=new int [5];
		int[] arr1=new int [5];
		int j=0;
		int i=0;
		int k=0;
		for(i=0;i<5;i++)
		{
			arr[i]=scan.nextInt();
		}
		int min=arr[0];
	    for(i=0;i<5;i++)
	    {
	    	min=arr[i];
	    	for(j=i;j<5;j++)
	    	{
	    		if(min>arr[j])
	    		{
	    			min=arr[j];
	    			k=j;
	    		}
	    	}
	    	int swap=arr[k];
	    	arr[k]=arr[i];
	    	arr[i]=swap;
	    	arr1[i]=min;
	    	
	    }
	    System.out.println(arr1[0]+" "+arr1[1]+" "+arr1[2]+" "+arr1[3]+" "+arr1[4]);
	    scan.close();
	}

}
