import static java.lang.System.out;

class StringOperations
{
	static public void main(String...args)
	{
		String str = "indore city";
		out.println(str.toUpperCase());		//to convert string to uppercase

		String str1 = "BHOPAL CITY";
		out.println(str1.toLowerCase());		//to conver string to lowercase
		
		String str2 = "   sammed shikharji   " ;
		out.println(str2.trim());			//to trim LHS and RHS spaces

		String str3 = "  jinvaniji";
		out.println(str3.replace('i','I')); 	//to replace a character with anoter one

		String str4 = " veetrag sharman sanskriti";
		out.println(str4.replaceAll("veertag","Bharatiya")); 		//to replace a complete string
		
		out.println(str3.indexOf('j'));						//to find index of a pirticular character
		out.println(str3.charAt(4));							//to find character at a pirticular index

		String str5 = "MCA";
		String str6 = "Degree";
		out.println(str5.concat(str6));						//to concat two strings
	
		int COUNT=0;
		
		// to find vowels in a string

		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				COUNT++;
			}
		}

		out.println("There are "+COUNT +" vowels in " +str);
	}
}