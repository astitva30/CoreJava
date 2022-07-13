import java.util.Scanner;
import java.util.Date;
import java.io.*;

class Areas
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
			System.out.println("1.Find Area Of Circle.");
			System.out.println("2.Find Area Of Triangle.");
			System.out.println("3.Find Area Of Rectangle.");
			System.out.println("Enter the number of which you want to perform function.");
			short num = sc.nextShort();
			
			switch(num)
			{
				case 1:
					System.out.println("Enter the radius:");
					float radius = sc.nextFloat();
					System.out.println("Area of circle is: " + (radius*radius*22)/7);
				
				case 2:
					System.out.println("Enter base and height respectively: ");
					float base = sc.nextFloat();
					float height = sc.nextFloat();
					System.out.println("The area of triangle is : " + base*height/2);
				case 3:
					System.out.println("Enter length and bredth respecively: ");
					float length = sc.nextFloat();
					float bredth = sc.nextFloat();
					System.out.println("Area of rectangle is : " + length*bredth);
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
			