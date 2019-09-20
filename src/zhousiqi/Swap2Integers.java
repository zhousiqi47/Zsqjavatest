package zhousiqi;
import java.util.Scanner;

public class Swap2Integers {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Please input a number:");
		int a=in.nextInt();
		System.out.print("Please input another number:");
		int b=in.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.print(a+" "+b);
		in.close();
	}

}
