import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.out;

class ArrayLambdaExp
{
	static public void main(String...argu)
	{
		ArrayList list = new ArrayList();
		list.add(1211);
		list.add("abc");
		list.add('a');
		list.add(1.222f);
		list.add(4441.444522);
		
		out.println(list);


		//ArrayList to create dynamic array of type integer only
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		list1.add(3246);
		list1.add(246);
		list1.add(46);
		list1.add(326);
		list1.add(676);
		list1.add(6);

		Collections.sort(list1);		//use collections to sort dynamic array only
		out.println(list1); 		//printing normally
		
		//printing elements using for loop
		out.println("\nprinting using for loop:");
		for(int i=0;i<list1.size();i++)		
		{	out.print(list1.get(i)+"\t");	}	//using size to get size of dynamic list and using get function
		
		
		//printing using for each loop
		out.println("\nprinting using for each loop:");
		for(Integer data: list1)
		{
			out.print(data+"\t");
		}

		//printing elements using lambda expression
		out.println("\nprinting elements using lambda expresssion: ");
		list1.forEach
		(	data -> 
			out.print(data+"\t")
		);
		
	}
}