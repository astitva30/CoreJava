import java.util.Scanner;
import java.util.Date;
import java.io.*;

class Volumes
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
			System.out.println("1.Find Volume Of Cone.");
			System.out.println("2.Find Volume Of Sphere.");
			System.out.println("3.Find Volume Of Cylender.");
			System.out.println("Enter the number of which you want to perform function.");
			short num = sc.nextShort();
			
			switch(num)
			{
				case 1:
					System.out.println("Enter the radius and height respectively:");
					float radius1 = sc.nextFloat();
					float height1 = sc.nextFloat();
					System.out.println("Volume of cone is: " + (radius1*radius1*height1*22)/21);
					break;
				
				case 2:
					System.out.println("Enter the radius: ");
					float radius2 = sc.nextFloat();
					System.out.println("The volume of sphere is : " + (radius2*radius2*radius2*22*4)/21);
					break;

				case 3:
					System.out.println("Enter radius and height respecively: ");
					float radius3 = sc.nextFloat();
					float height3 = sc.nextFloat();
					System.out.println("Area of rectangle is : " + (22*radius3*radius3*height3)/7);
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
	