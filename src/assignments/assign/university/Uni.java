package university;

import static java.lang.System.out;

public class Uni
{
	private String uniName;
	private int totalCourses;
	private int regNo;

	public void set(String uniName,int totalCourses, int regNo)
	{
		this.uniName = uniName;
		this.totalCourses = totalCourses;
		this.regNo = regNo;
	}
	
	public void show()
	{
		out.println(uniName+"  "+totalCourses+"  "+regNo);
	}
}