package zhousiqi2;

public class DateTest {
	public static void main(String[] args) {
		Date d1=new Date(2000,5,30);
		System.out.println(d1);
		d1.setDate(2000, 3, 16);
		System.out.println(d1.getYear()+" "+d1.getMonth()+" "+d1.getDay());
		
		
	}

}
