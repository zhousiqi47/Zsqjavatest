package zhousiqi2;

public class TimeTest {
	public static void main(String[] args) {
		Time t1=new Time(20,3,56);
		System.out.println(t1.getMin());
		Time t2=new Time();
		System.out.println(t2);
		//t2.setMin(60);
		t2.setTime(23, 59, 59);
		System.out.println(t2);
		System.out.println(t1.nextSecond());
		System.out.println(t2.nextSecond());
	}

}
