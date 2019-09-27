package zhousiqi;
import java.util.*;

public class CountVowelsDigits {
	public static void main (String[] args) {
		String str;
		Scanner in=new Scanner(System.in);
		str=in.next();
		int len=str.length();
		int vowels=0,digits=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)<='9'&&str.charAt(i)>='0')
			{
				digits++;
			}
			else {
				vowels++;
			}
				
		}
		float vowel=100*vowels/(vowels+digits);
		float digit=100-vowel;
		System.out.println("Number of vowels is:"+vowels+"("+vowel+"%)");
		System.out.println("Number of digits is:"+digits+"("+digit+"%)");
		in.close();
		
	}

}
