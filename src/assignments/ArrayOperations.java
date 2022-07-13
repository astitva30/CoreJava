import java.util.Arrays;
import static java.lang.System.out;
import java.util.Scanner;


class ArrayOperations
{
	static public void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter size of the array: ");
		int size= sc.nextInt();

		int arr[]= new int[size];	
		
		out.println("Enter elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}

		//sorting elements in ascending order
		Arrays.sort(arr);
		out.println("\nElements in ascending order are: ");
		for(int i=0;i<arr.length;i++)
		{
			out.print(arr[i]+"\t");
		}
		
		//sorting elements in descending order
		out.println("\nElements in descending order are: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			out.print(arr[i]+"\t");
		}

		//to sort even and odd numbers
		out.println("\nEven numbers in sorted order are: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{out.print(arr[i]+"\t");}
		}

		out.println("\nOdd numbers in sorted order are: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{out.print(arr[i]+"\t");}
		}
		
		//to find a pirticular number in an array
		out.println("\nEnter the number you want to find:");
		int key = sc.nextInt();
		int INDEX=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{INDEX=i+1;}
		}
		out.println("\nElement found at index " +INDEX);
		

	}
}












