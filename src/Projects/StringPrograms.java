import java.util.Scanner;
import static java.lang.System.out;

class StringPrograms
{
	static public void main(String...argu)
	{
		Scanner sc = new Scanner(System.in);
		out.print("Enter a string: ");
		String str = sc.next();
		str=str.trim();
		int VOWELS=0;
		String str1=str.replace(" ","");
		for(int i=0;i<str.length();i++)		//to find number of vowels and consonents in a string
		{
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ||str.charAt(i)=='A' ||str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U')
			{
				VOWELS++;
			}
		}
		int CONSONENTS = str1.length()-VOWELS;
		out.println("There are "+VOWELS+" vowels and " + CONSONENTS+" consonents in " +str);



		boolean FLAG=true;
		for(int i=0;i<=str.length()/2;i++)						//to check if a string is palindrome or not
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				FLAG=false;
				break;
			}
		}
		if(FLAG==true){out.println(str+" is palindrome.");}
		else{out.println(str+" is not palindrome.");}



		str1=str.substring(0,1).toUpperCase()+str.substring(1,str.length());						// to convert first letter of a string to uppercase
		out.println(str + " after converting first letter to capital: " + str1);	



		out.print("String after converting to uppercase without using inbuilt method: " );			//to convert to uppercase without using inbuilt method
		String str2="";
		int ascii=0;
		char CHARACTER=' ';
		for(int i=0;i<str.length();i++)
		{
			ascii = str.charAt(i);
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				ascii=ascii-32;
			}
			CHARACTER =(char)ascii;
			str2=str2+CHARACTER;

		}




		out.println(str2);
		str2="";
		out.print("\nString after converting to lowercase without using inbuilt method: " );			//to convert to lowercase without using inbuilt method
		for(int i=0;i<str.length();i++)
		{
			ascii = str.charAt(i);
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				
				ascii=ascii+32;
			}
			CHARACTER =(char)ascii;
			str2=str2+CHARACTER;
		}
		out.println(str2);




		str2="";
		int LENGTH =0;
		out.print("\nLength of a String without using inbuilt method---> " );			//finding length without using inbuilt method
		for(int i=0;i<str.length();i++)
		{
			ascii = str.charAt(i);
			if(str.charAt(i)>=0 && str.charAt(i)<=127)
			{
				
				LENGTH++;
			}
		}
		out.println(LENGTH);

	}
}

























