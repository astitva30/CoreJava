import java.util.Scanner;
import java.util.Date;

class ScannerDateRuntime
{
	static
	{
		System.out.println("Welcome...");
		Date date = new Date();
		System.out.println(date);
	}
	
	static public void main(String...ar)throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = sc.next();
		
		if(password.equals("Abc123"))
		{
			System.out.println("Enter company name: ");
			String cmpName = sc.next();
			System.out.println("Enter contact number: ");
			long contactNo = sc.nextLong();
			System.out.println("Enter turnover: ");
			float turnOver = sc.nextFloat();
			System.out.println("Enter CEO Name: ");
		sc.next();
			String ceo = sc.nextLine();
			System.out.println("Enter Rank: ");
			byte rank = sc.nextByte();
			System.out.println("Enter total number of flights: ");
			short totalFlights = sc.nextShort();
			System.out.println("Enter Website name: ");
		sc.next();
			String websiteName = sc.nextLine();
			System.out.println("Enter mail ID: ");
			String mailId = sc.nextLine();

			System.out.println("-------------------AIRLINE INFO-------------------");
			System.out.println("Company : " + cmpName);
			System.out.println("Contact : " + contactNo);
			System.out.println("Turnover: " + turnOver);
			System.out.println("CEO Name: " + ceo);
			System.out.println("Rank    : " + rank);
			System.out.println("Website : " + websiteName);
			System.out.println("Mail    : " + mailId);
			System.out.println("Total Flights: " + totalFlights);
		}
		else
		{
			Runtime run = Runtime.getRuntime();
			run.exec("c:/windows/system32/rundll32.exe user32.dll , LockWorkStation");
		}

	}
}







