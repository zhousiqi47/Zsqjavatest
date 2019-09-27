package zhousiqi;
import java.util.*;

public class TestPalindromicWord {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int len=str.length();
		int num=1;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1))
			{
				num=0;
			}
			else
			{
			}
		}
		if(num==0)
			System.out.print("It's not a Palindromic word.");
		else
			System.out.print("Yes");
		in.close();
	}

}
