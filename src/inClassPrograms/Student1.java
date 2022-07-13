import static java.lang.System.out;

class Student1 
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
}

class MainClass
{
	static public void main(String...argu)
	{
		Student1 stud = new Student1();
		stud.setStudentData(123,"Astitva","IpsAcademy");
		stud.show();
		out.println(stud);
	}
}