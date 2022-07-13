import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;

class RepublicDayGuest
{
	static
	{
		out.println("\n============HELLO============");
		out.println(new Date());
		
	}//end of static block

	static public void main(String...ar)throws Exception
	{		
		Scanner sc = new Scanner(System.in);
		out.println("\nEnter password: ");
		String password = sc.next();
		
		if(password.equals("Abc123"))
		{
			out.println("---> Correct Password!");
			
			out.println("Different guests were invited every year on Republic Day Celebration.");
			out.println("Enter year and then the details about the GUEST will be displayed.");
			out.println("Year range--> [2010,2020]");
			out.print("Enter the year: ");
			int year = sc.nextInt();

			switch(year)
			{
				case 2010:
					out.println("\nChief Guest: Lee Myung Bak");
					out.println("Designation: President of South Korea");
					out.println("Country: South Korea");
					break;
				case 2011:
					out.println("\nChief Guest: Susilo Bambang Yudhoyono");
					out.println("Designation: President of Indonesia");
					out.println("Country: Indonesia");
					break;
				case 2012:
					out.println("\nChief Guest: Yingluck Shinawatra");
					out.println("Designation: Prime Minister of Thailand");
					out.println("Country: Thailand");
					break;
				case 2013:
					out.println("\nChief Guest: Jigme Khesar Namgyel Wangchuck");
					out.println("Designation: King of Bhutan");
					out.println("Country: Bhutan");
					break;
				case 2014:
					out.println("\nChief Guest: Shinzo Abe");
					out.println("Designation: Prime Minister of Japan");
					out.println("Country: Japan");
					break;
				case 2015:
					out.println("\nChief Guest: Barack Obama");
					out.println("Designation: President of the United States");
					out.println("Country: United States");
					break;
				case 2016:
					out.println("\nChief Guest: François Hollande");
					out.println("Designation: President of France");
					out.println("Country: France");
					break;
				case 2017:
					out.println("\nChief Guest: Mohammed bin Zayed Al Nahyan");
					out.println("Designation: Crown Prince of Abu Dhabi");
					out.println("Country: United Arab Emirates");
					break;
				case 2018:
					out.println("\nChief Guest: Lee Hsien Loong");
					out.println("Designation: Prime Minister of Singapore");
					out.println("Country: Singapore");
					break;
				case 2019:
					out.println("\nChief Guest: Cyril Ramaphosa");
					out.println("Designation: President of South Africa");
					out.println("Country: Indonesia");
					break;
				case 2020:
					out.println("\nChief Guest: Jair Bolsonaro");
					out.println("Designation: President of Brazil");
					out.println("Country: Brazil");
					break;
				default:
					out.println("Invalid Year.");
					
			}//end of switch
			
		}//end of if
		else
		{
			out.println("Wrong Password");
			Runtime run = Runtime.getRuntime();
			run.exec("c:/windows/system32/rundll32.exe  user32.dll , LockWorkStation");
		}//end of else

	}//end of main
}