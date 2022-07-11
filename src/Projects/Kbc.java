import java.util.Date;
import java.util.Scanner;
import static java.lang.System.out;
class Kbc
{
	static
	{
		out.println("\t\t\t\t\t"+new Date());
		
	}

	static void printOptions(String A, String B, String C, String D)
	{
		out.println("\nA)" + A + "\t\t\t B)" + B + "\nC)" + C + "\t\t\t D)" + D);
	}

	static public void main(String...ar)throws Exception
	{
		Scanner sc = new Scanner(System.in);
		out.print("Enter password: ");
		String password = sc.next();
		if(password.equals("Abc123"))
		{
			out.println("Correct Password!.. you are ready to Play!!.");
			out.println("\n--------------------WELCOME TO KAUN BANEGA CROREPATI--------------------");
			out.println("\n->   You will be given 10 questions and each correct answer will reward you 1 Lakhs!");
			out.println("\n->   There will be 2 LifeLines to help you out and they can be used only once!");
			out.println("\n->   How to use LifeLines?\tType FF in choice to use 50-50\tType FQ in choice to use flip the question lifeline.");
			out.println("\n->   Enter the correct option to submit your answer.\n");
			
			String input = "";
			byte FF =0;
			byte FQ =0;
			String A ="";
			String B ="";
			String C ="";
			String D ="";	
			byte SCORE =0;		
			
			switch(1)
			{
				case 1:
					out.println("Ques 1 -> What is the size of float and double in java?");
					A="32 and 64";
					B="32 and 32";
					C="64 and 64";
					D="64 and 32";
					printOptions(A,B,C,D);
					out.print("Enter your choice: ");			
					input = sc.next();

					if(input.equals("A"))
					{
						out.println("CORRECT ANSWER");
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							printOptions(A,"",C,"");
							out.print("Enter your choice: ")	;			
							input = sc.next();

							if(input.equals("A"))
							{
								out.println("CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								out.println("Wrong Answer.");
							}
							FF++;
						}
						else
						{
							out.println("You already used this LifeLine.");
							out.print("Enter your choice: ");	
							input = sc.next();
							if(input.equals("A"))
							{
								out.println("CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								out.println("Wrong Answer.");
							}
						}

					}
					/*else if(input.equals("FQ")
					{
						if(FQ==0)
						{
						}
						else
						{
							out.println("You already used this LifeLine.");
						}
					}*/
					else
					{
						out.println("Wrong Answer.");
					}

				case 2:
					out.println("Ques 2 -> Select the valid statement.");
					A="char[] ch = new char(5)";
					B="char[] ch = new char[5]";
					C="char[] ch = new char()";
					D="char[] ch = new char[]";
					printOptions(A,B,C,D);
					out.print("Enter your choice: ")	;			
					input = sc.next();

					if(input.equals("B"))
					{
						out.println("CORRECT ANSWER");
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							printOptions("",B,C,"");
							out.print("Enter your choice: ")	;			
							input = sc.next();

							if(input.equals("B"))
							{
								out.println("CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								out.println("Wrong Answer.");
							}
							FF++;
						}
						else
						{
							out.println("You already used this LifeLine.");
							out.print("Enter your choice: ");	
							input = sc.next();
							if(input.equals("B"))
							{
								out.println("CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								out.println("Wrong Answer.");
							}
						}

					}
					/*else if(input.equals("FQ")
					{
						if(FQ==0)
						{
						}
						else
						{
							out.println("You already used this LifeLine.");
						}
					}*/
					else
					{
						out.println("Wrong Answer.");
					}


				case 3:
					out.println("Ques 3 -> In which of the following is toString() method defined?.");
					A="java.lang.Object";
					B="java.lang.String";
					C="java.lang.util";
					D="None";
					printOptions(A,B,C,D);
					out.print("Enter your choice: ")	;			
					input = sc.next();

					if(input.equals("A"))
					{
						out.println("CORRECT ANSWER");
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							printOptions(A,B,"","");
							out.print("Enter your choice: ");			
							input = sc.next();

							if(input.equals("A"))
							{
								out.println("CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								out.println("Wrong Answer.");
							}
							FF++;
						}
						else
						{
							out.println("You already used this LifeLine.");
							out.print("Enter your choice: ");	
							input = sc.next();
							if(input.equals("A"))
							{
								out.println("CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								out.println("Wrong Answer.");
							}
						}

					}
					/*else if(input.equals("FQ")
					{
						if(FQ==0)
						{
						}
						else
						{
							out.println("You already used this LifeLine.");
						}
					}*/
					else
					{
						out.println("Wrong Answer.");
					}

				case 4:
					out.println("Ques 4 -> compareTo() returns");
					A="True";
					B="False";
					C="An int value";
					D="None";
					printOptions(A,B,C,D);
					out.print("Enter your choice: ")	;			
					input = sc.next();

					if(input.equals("C"))
					{
						out.println("CORRECT ANSWER");
						SCORE++;
					}

					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							printOptions(A,"",C,"");
							out.print("Enter your choice: ");			
							input = sc.next();

							if(input.equals("C"))
							{
								out.println("CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								out.println("Wrong Answer.");
							}
							FF++;
						}
						else
						{
							out.println("You already used this LifeLine.");
							out.print("Enter your choice: ");	
							input = sc.next();
							if(input.equals("C"))
							{
								out.println("CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								out.println("Wrong Answer.");
							}
						}

					}
					/*else if(input.equals("FQ")
					{
						if(FQ==0)
						{
						}
						else
						{
							out.println("You already used this LifeLine.");
						}
					}*/
					else
					{
						out.println("Wrong Answer.");
					}

				case 5:
					out.println("Ques 5 -> Identify the return type of a method that does not return any value.");
					A="Int";
					B="Void";
					C="Double";
					D="None";
					printOptions(A,B,C,D);
					out.print("Enter your choice: ")	;			
					input = sc.next();

					if(input.equals("B"))
					{
						out.println("CORRECT ANSWER");
						SCORE++;
					}

					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							printOptions(A,"",C,"");
							out.print("Enter your choice: ");			
							input = sc.next();

							if(input.equals("B"))
							{
								out.println("CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								out.println("Wrong Answer.");
							}
							FF++;
						}
						else
						{
							out.println("You already used this LifeLine.");
							out.print("Enter your choice: ");	
							input = sc.next();
							if(input.equals("B"))
							{
								out.println("CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								out.println("Wrong Answer.");
							}
						}

					}
					/*else if(input.equals("FQ")
					{
						if(FQ==0)
						{
						}
						else
						{
							out.println("You already used this LifeLine.");
						}
					}*/
					else
					{
						out.println("Wrong Answer.");
					}
						
			}//end of switch
		
			out.println("\nYou won " +SCORE + " Lakh!");
			
		}//end of if
		else
		{
			out.println("Wrong Password!.. Quit!!.");
			Runtime run = Runtime.getRuntime();
			run.exec("c:/windows/system32/rundll32.exe  user32.dll , LockWorkStation");
		}
	}//end of main 
}//end of class