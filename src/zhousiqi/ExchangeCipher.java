package zhousiqi;
import java.util.*;

public class ExchangeCipher {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next().toUpperCase();
		int len=str.length();
		int i=0;
		char charAt;
		for(i=0;i<len;i++)
		{
			if(str.charAt(i)!='Z')
			{
				charAt=str.charAt(i);
				charAt=(char)(charAt+1);
				System.out.print(charAt);
			}
			else
			{
				System.out.print("A");
			}
			
		}
		in.close();
	}

}
