import java.io.FileWriter;
import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;


class TextFileWriter
{
	static public void main(String...args)throws Exception
	{
		int COUNT =7;
		out.println("Total number of vowels: "+COUNT);
		
		Scanner sc = new Scanner(System.in);
	
		out.println("Enter filename to save output: ");						//taking filename input
		String fileName = sc.next();
	
		out.println("Enter the location where you want to save the file: ");		//taking destination input
		String location = sc.next();

		FileWriter fw = new FileWriter(location+"/"+fileName);					
		
		fw.write("Total number of vowels: "+COUNT+ "\t"+ new Date());
		fw.close();
		
		out.println("Data Saved Successfully");
	}
}