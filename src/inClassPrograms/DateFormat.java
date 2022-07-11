import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


class DateFormat1
{
	static public void main(String...args)
	{
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh.mm.ss a E z");
		System.out.println(sdf.format(date));
		
		System.out.println("------------------------------------------");
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(date));
	}
}