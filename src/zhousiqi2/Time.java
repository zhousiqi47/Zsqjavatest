package zhousiqi2;

public class Time {
	private int hour;
	private int minute,second;
	public void setHour(int h)
	{
		if(h<0||h>24)
		{
			throw new IllegalArgumentException("Invalid hour!");
		}
		else
		{
			hour=h;
		}
	}
	public void setMin(int m)
	{
		if(m<0||m>59)
		{
			throw new IllegalArgumentException("Invalid minute!");
		}
		else
		{
			minute=m;
		}
	}
	public void setSecond(int s)
	{
		if(s<0||s>59)
		{
			throw new IllegalArgumentException("Invalid second!");
		}
		else
		{
			second=s;
		}
	}
	public void setTime(int h,int min,int s)
	{
		this.setSecond(s);
		this.setHour(h);
		this.setMin(min);
	}
	Time(int h,int m,int s)
	{
		this.setTime(h, m, s);
	}
	Time()
	{
		hour=0;
		minute=0;
		second=0;
	}
	public int getSecond()
	{
		return this.second;
	}
	public int getMin()
	{
		return this.minute;
	}
	public int getHour()
	{
		return this.hour;
	}
	public String toString()
	{
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}
	public Time nextSecond()
	{
		second=second+1;
		if(second==60)
		{
			second=0;
			minute++;
			if(minute==60)
			{
				minute=0;
				hour++;
				if(hour==24)
				{
					hour=0;
				}
			}
		}
		return this;
	}

}
