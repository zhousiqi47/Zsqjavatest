package zhousiqi2;

public class Student {
	private String name;
	private String address;
	private int numCourses=0;
	private String[] courses= {};
	private int [] grades;
	
	public Student(String name,String address)
	{
		this.name=name;
		this.address=address;
		courses =new String[30];
		grades=new int[30];
		numCourses=0;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String toString()
	{
		return name+"("+address+")";
	}
	public void addCourseGrade(String course,int grade) 
    {       
		courses[numCourses] = course;       
	    grades[numCourses] = grade;       
		++numCourses;    
    }
	public void printGrades()
	{
		System.out.println(name);
		for(int i=0;i<numCourses;i++)
		{
			System.out.println(" "+courses[i]+" "+grades[i]);
		}
	}
	public double getAverageGrade()
	{
		double sum=0;
		for(int i=0;i<numCourses;i++)
		{
			sum=sum+grades[i];
		}
		double ave=(double)sum/numCourses;
		return ave;
	}
	

}
