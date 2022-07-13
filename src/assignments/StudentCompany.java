import java.util.Scanner;
import java.util.Date;
import java.io.*;

class StudentCompany
{
	static
	{
		System.out.println("Welcome----");
		Date date = new Date();
		System.out.println(date);
	}
	
	static public void main(String... argu)throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password:");
		String password = sc.next();
		
		if(password.equals("Abc123"))
		{
			System.out.println("Correct Password");
			
			System.out.println("Enter RollNo: ");
			int rollNo = sc.nextInt();

			System.out.println("Enter Student Name: ");
			String name = sc.next();

			System.out.println("Enter College Name: ");
		sc.nextLine();
			String collegeName = sc.nextLine();

			System.out.println("Enter Course: ");
			String course = sc.nextLine();

			System.out.println("Enter Branch: ");
			sc.nextLine();
			String branch = sc.nextLine();

			System.out.println("Enter Semester: ");
			short sem = sc.nextShort();

			System.out.println("Enter Subject Name: ");
		sc.nextLine();
			String subject = sc.nextLine();

			System.out.println("Enter Maximum Marks: ");
			int maxMarks = sc.nextInt();

			System.out.println("Enter Minimum Marks: ");
			int minMarks = sc.nextInt();

			System.out.println("Enter Obtained Marks: ");
			int obtMarks = sc.nextInt();
			
			int percentage = (obtMarks*100)/maxMarks;
			System.out.println("Percentage: " + percentage);
			short grade;
			if(percentage>=80)
			{
				grade = 1;
			}
			else if(percentage>=60 && percentage<80)
			{
				grade = 2;
			}
			else
			{
				grade = 3;
			}
			
			
			switch(grade)
			{
				case 1:
					System.out.println("\nYour grade is: A");
					System.out.println("According to your grade, you can apply to following companies: ");
					System.out.println("1.Google\n2.Amazon\n3.Apple");
					System.out.println("Enter the number to know about the company: ");
					short num1 = sc.nextShort();
					
					switch(num1)
					{
						case 1:
							System.out.println("\nCompany Name: GOOGLE");
							System.out.println("CEO Name: Sundar Pichai");
							System.out.println("Total Branches: 500+");
							System.out.println("Website: Google.com");
							System.out.println("Contact: 022 3043 0101");
							System.out.println("Address: Mountain View, California, United States");
							System.out.println("City: California");
							break;
						case 2:
							System.out.println("\nCompany Name: AMAZON");
							System.out.println("CEO Name: Andy Jassy");
							System.out.println("Total Branches: 500+");
							System.out.println("Website: Amazon.com");
							System.out.println("Contact: 022 3043 0101");
							System.out.println("Address: Seattle, Washington, United States");
							System.out.println("City: Washington");
							break;
						case 3:
							System.out.println("\nCompany Name: APPLE");
							System.out.println("CEO Name: Tim Cook");
							System.out.println("Total Branches: 519");
							System.out.println("Website: Apple.com");
							System.out.println("Contact: 000800 040 1966");
							System.out.println("Address: Infinite Loop; Cupertino, CA 95014");
							System.out.println("City: California");
							break;
					}
					break;

				case 2:
					System.out.println("\nYour grade is: B");
					System.out.println("According to your grade, you can apply to following companies: ");
					System.out.println("1.Hexaware\n2.Deloitte\n3.Adobe");
					System.out.println("Enter the number to know about the company: ");
					short num2 = sc.nextShort();

					switch(num2)
					{
						case 1:
							System.out.println("\nCompany Name: HEXAWARE");
							System.out.println("CEO Name: R Srikrishna");
							System.out.println("Total Branches: 37");
							System.out.println("Website: Hexaware.com");
							System.out.println("Contact: +1-609-409-6950");
							System.out.println("Address: Navi Mumbai");
							System.out.println("City: Mumbai");
							break;
						case 2:
							System.out.println("\nCompany Name: Deloitte");
							System.out.println("CEO Name: Punit Renjen");
							System.out.println("Total Branches: 700+");
							System.out.println("Website: Deloitte.com");
							System.out.println("Contact: 022 3043 0101");
							System.out.println("Address: London, England, UK");
							System.out.println("City: London");
							break;
						case 3:
							System.out.println("\nCompany Name: ADOBE");
							System.out.println("CEO Name: Shantanu Narayen");
							System.out.println("Total Branches: 67");
							System.out.println("Website: Adobe.com");
							System.out.println("Contact: 408-536-6000");
							System.out.println("Address: San Jose, California, United States");
							System.out.println("City: California");
							break;
					}
					break;
				
				case 3:
					System.out.println("\nYour grade is: C");
					System.out.println("According to your grade, you can apply to following companies: ");
					System.out.println("1.TCS\n2.Infosys\n3.Wipro");
					System.out.println("Enter the number to know about the company: ");
					short num3 = sc.nextShort();

					switch(num3)
					{
						case 1:
							System.out.println("\nCompany Name: TCS");
							System.out.println("CEO Name: Rajesh Gopinathan");
							System.out.println("Total Branches: 150+");
							System.out.println("Website: Tcs.com");
							System.out.println("Contact: +91-22-6656 8484");
							System.out.println("Address: Navi Mumbai");
							System.out.println("City: Mumbai");
							break;
						case 2:
							System.out.println("\nCompany Name: Infosys");
							System.out.println("CEO Name: Salil Parekh");
							System.out.println("Total Branches: 150+");
							System.out.println("Website: Infosys.com");
							System.out.println("Contact: +91-22-6656 8484");
							System.out.println("Address: Bengaluru");
							System.out.println("City: Bengaluru");
							break;
						case 3:
							System.out.println("\nCompany Name: Wipro");
							System.out.println("CEO Name: Thierry Delaporte");
							System.out.println("Total Branches: 15");
							System.out.println("Website: Wipro.com");
							System.out.println("Contact: +91 (80) 28440011");
							System.out.println("Address: Bengaluru");
							System.out.println("City: Bengaluru");
							break;
					}
					break;
			}
		}
		else
		{
			System.out.println("Wrong Password");
			Runtime run = Runtime.getRuntime();
			run.exec("c:/windows/system32/rundll32.exe user32.dll,LockWorkStation");
		}
	}
}