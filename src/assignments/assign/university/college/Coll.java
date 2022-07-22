package university.college;

import static java.lang.System.out;
import university.Uni;

public class Coll extends Uni
{
	private String collName;
	private int regNo;
	private int contactNo;

	public void set(String collName, int regNo, int contactNo)
	{
		super.set("RGPV",35,20485);
		this.collName = collName;
		this.regNo = regNo;
		this.contactNo = contactNo;
	}

	public void show()
	{	
		super.show();
		out.println(collName+"  "+regNo+"  "+contactNo);
	}
}