package student;

import university.college.Coll;
import static java.lang.System.out;
import fees.Amount;
import myexception.FeesException;
import java.util.Scanner;

public class Stu extends Coll implements Amount
{
	private int rollNo;
	private String stuName;
	private String courseName;
	private int amount;

	public void set(int rollNo, String stuName, String courseName)
	{
		super.set("IPS",45,9834758);
		this.rollNo = rollNo;
		this.stuName = stuName;
		this.courseName = courseName;
	}

	public void show()
	{
		super.show();
		out.println(rollNo+"  "+stuName+"  "+courseName);
	}
	
	public void getFees()
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter Fee Amount: " );
		this.amount = sc.nextInt();
	
		if(amount<50000)
		{
			FeesException ref = new FeesException();
			throw ref;
		}
		else
		{
			out.println("Valid Fee Amount!");
		}
	}
}