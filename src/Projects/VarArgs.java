import java.util.Arrays;
import java.util.Scanner;

class VarArgs
{
	static boolean checkForPrime(int inputNumber)
	{
		boolean isItPrime = true;
 
		if(inputNumber <= 1) 
		{
			isItPrime = false;
 
			return isItPrime;
		}
		else
		{
			for (int i = 2; i<= inputNumber/2; i++) 
			{
				if ((inputNumber % i) == 0)
				{
					isItPrime = false;
 
					break;
				}
			}
			return isItPrime;
 		}		
	}
	static public void main(String...ar)
	{
		int[] arr= new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			arr[i]= Integer.parseInt(ar[i]);
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter 1 to sort array in ascending order\n\nEnter 2 to sort array in descending order\n\nEnter 3 to print sorted even numbers\n\nEnter 4 to print sorted odd numbers\n\nEnter 5 to print only prime number in sorted order\n");
		byte num = sc.nextByte();
		
		switch(num){

		case 1:
		//for sorting an array in ascending order
		Arrays.sort(arr);
		System.out.println("Elements in ascending order:");
		for(int data: arr)
		{
			System.out.print(data+"\t");
		}
		break;

		case 2:
		//for sorting an array in descending order
		System.out.println("\nElements in descending order:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+"\t");
		}
		break;

		case 3:

		// for printing even numbers in sorted order
		System.out.println("\nEven numbers in sorted order:");
		for(int data:arr)
		{
			if(data%2==0){
				System.out.print(data+"\t");
			}
		}
		break;

		case 4:
		
		//for printing odd numbers in sorted order
		System.out.println("\nOdd numbers in sorted order:");
		for(int data: arr)
		{
			if(data%2!=0)
			{
				System.out.print(data+"\t");
			}
		}
		break;

		case 5:
	
		//for printing only prime numbers
		System.out.println("\nPrime numbers are:");
		for(int data: arr)
		{
			if(checkForPrime(data)==true)
			{
				System.out.print(data+"\t");
			}
		}
		break;

		default:
			System.out.println("Enter valid number.");

		}//end of switch
	}
}