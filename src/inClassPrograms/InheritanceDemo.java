//Inheritance demonstration 	COMPANY-EMPLOYEE relationship

import static java.lang.System.out;
	
class Company
{	
	int regNo;
	String cmpName;
	
	Company()
	{
		regNo=0;
		cmpName=NULL;
	}
	void set(int regNo, String cmpName)
	{
		this.regNo= regNo;
		this.cmpName= cmpName;
	}
	void show()
	{
		out.println("----PARENT CLASS----");
		out.println(regNo+"  "+cmpName);
	}
}

class Employee extends Company
{
	int empId;
	String empName;
	
	void set(int empId, String empName)
	{
		super.set(1211,"Wipro");
		this.empId= empId;
		this.empName= empName;
	}
	void show()
	{
		out.println("----Child Class----");
		out.println(empId+"  "+empName);
	}
}

class InheritanceDemo
{
	static public void main(String...ar)
	{
		Employee ref = new Employee();
		ref.set(444,"Manoj");
		ref.show();
	}
}














