import java.util.Scanner;
import java.util.Date;
import java.io.*;

class VehicleFuel
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
			
			System.out.println("Enter the average of the vehicle: ");
			float avg = sc.nextFloat();
			System.out.println("Enter per day consumption (inLTR): ");
			float perDayConsumption = sc.nextFloat();
			System.out.println("Enter total petrol fillup: ");
			float totalPetrol = sc.nextFloat();
			
			System.out.println("Petrol in the vehicle will last for " + totalPetrol/perDayConsumption +" days");			
		}
		else
		{
			System.out.println("Wrong Password");
			Runtime run = Runtime.getRuntime();
			run.exec("c:/windows/system32/rundll32.exe user32.dll,LockWorkStation");
		}
	}
}