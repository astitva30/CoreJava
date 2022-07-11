// in this program we initialize rows at the starting but not the columns
// we initialize columns seperately if we want array to look like this
//			1  11  12  44
//			12 12
//		     5  5   5   5   5   5


import java.util.Scanner;
import static java.lang.System.out;

class ArrayConcept
{
	static public void main(String...args)
	{
		int ar[][]= new int[3][];
		ar[0]= new int[2];
		ar[1]= new int[1];
		ar[2]= new int[3];

		int CONST=1;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=CONST;
				out.print(ar[i][j]+"  ");
				CONST++;
			}
			out.println();
		}
	}
}