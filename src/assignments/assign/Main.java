import university.Uni;
import university.college.Coll;
import student.Stu;
import static java.lang.System.out;
import myexception.FeesException;

public class Main
{
	static public void main(String...args)
	{
		Stu stud = new Stu();

		stud.set(1,"Astitva","B.Tech");
		stud.show();
		
		try
		{
			stud.getFees();
		}
		catch( FeesException ex)
		{
			ex.printStackTrace();
			out.println("Fee should be more than 50000.");
		}
		
	}
		
}