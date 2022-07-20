import static java.lang.System.out;

class StudentToString 
{
	int rNo;
	String sNm;
	String cNm;
	
	void setStudentData(int rollNo, String stuName, String collName)
	{
		rNo = rollNo;	
		sNm = stuName;
		cNm = collName;
	}
	void show()
	{
		out.println("-------STUDENT INFO-------");
		out.println(rNo+" "+sNm+" "+cNm);
	}
	public String toString()
	{
		return rNo+" "+sNm+" " +cNm;
	}
		
	public void finalize()
	{
		out.println("memory is free.....");
	}
}

class MainClass
{
	static public void main(String...argu)
	{
		StudentToString stud = new StudentToString();
		stud.setStudentData(123,"Astitva","IpsAcademy");
		stud.show();
		out.println(stud);
	}
}