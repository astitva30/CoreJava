import static java.lang.System.out;
import java.util.Scanner;

class MatrixSum
{
	static public void main(String...ar)
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter number of rows: ");
		int rows= sc.nextInt();
		out.println("Enter number of columns: ");
		int cols= sc.nextInt();
		
		int arr[][]= new int[rows][cols];
		out.println("Enter elements of the matrix: ");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
	
		int SUM =0;
		int DAIGONAL_SUM=0;
		out.println("The array is: ");

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				out.print(arr[i][j]+"  ");
				SUM = SUM + arr[i][j];
				
				if(i==j)
				{DAIGONAL_SUM=DAIGONAL_SUM+arr[i][j];}
			}
			out.println();
		}

		out.println("The sum of all the elements in the array is : " + SUM);
		out.println("The sum of daigonal elements are: " + DAIGONAL_SUM);
	}
}