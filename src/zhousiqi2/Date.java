package zhousiqi2;

public class Date {
	private int year;
	private int month;
	private int day;
	
	Date(int year,int month,int day)
	{
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public int getYear()
	{
		return year;
	}
	public int getMonth()
	{
		return month;
	}
	public int getDay()
	{
		return day;
	}
	public String toString()
	{
		return year+" "+month+" "+day;
	}
	public void setDate(int y,int m,int d)
	{
		year=y;
		month=m;
		day=d;
	}

}
