import java.util.Date;
import java.util.Scanner;
import static java.lang.System.out;
import javax.swing.JOptionPane;
class Kbc
{
	static
	{
		JOptionPane.showMessageDialog(null,"\t\t\t\t\t"+new Date());
		
	}

	static String printOptions(String A, String B, String C, String D)
	{
		String str="\nA)" + A + "\t\t\t B)" + B + "\nC)" + C + "\t\t\t D)" + D;
		return str;
	}

	static public void main(String...ar)throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String password = JOptionPane.showInputDialog("Enter password: ");

		if(password.equals("Abc123"))
		{
			JOptionPane.showMessageDialog(null,"Correct Password!.. you are ready to Play!!.\n--------------------WELCOME TO KAUN BANEGA CROREPATI--------------------\n->   You will be given 10 questions and each correct answer will reward you 1 Lakhs!\n->   There will be 2 LifeLines to help you out and they can be used only once!\n->   How to use LifeLines?\tType FF in choice to use 50-50\tType FQ in choice to use flip the question lifeline.\n->   Enter the correct option to submit your answer.\n");
			/*
			out.println("\n--------------------WELCOME TO KAUN BANEGA CROREPATI--------------------");
			out.println("\n->   You will be given 10 questions and each correct answer will reward you 1 Lakhs!");
			out.println("\n->   There will be 2 LifeLines to help you out and they can be used only once!");
			out.println("\n->   How to use LifeLines?\tType FF in choice to use 50-50\tType FQ in choice to use flip the question lifeline.");
			out.println("\n->   Enter the correct option to submit your answer.\n");
			*/
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
					A="32 and 64";
					B="32 and 32";
					C="64 and 64";
					D="64 and 32";
					
					

					input = JOptionPane.showInputDialog("Ques 1 -> What is the size of float and double in java?"+printOptions(A,B,C,D)+"\nEnter your choice: ");

					if(input.equals("A"))
					{
						JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							
							input = JOptionPane.showInputDialog("Ques 1 -> What is the size of float and double in java?"+printOptions(A,"",C,"")+"\nEnter your choice: ");			
							
							if(input.equals("A"))
							{
								JOptionPane.showMessageDialog(null,"CORRECT ANSWER!!");
								SCORE++;
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Wrong Answer!!");
							}
							FF++;
						}
						else
						{
							JOptionPane.showMessageDialog(null,"You already used this LifeLine.");
							input = JOptionPane.showInputDialog("Ques 1 -> What is the size of float and double in java?"+printOptions(A,B,C,D)+"\nEnter your choice: ");
							if(input.equals("A"))
							{
								JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Wrong Answer.");
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
						JOptionPane.showMessageDialog(null,"Wrong Answer.");
					}

                case 2:
					A="char[] ch = new char(5)";
					B="char[] ch = new char[5]";
					C="char[] ch = new char()";
					D="char[] ch = new char[]";
					
					

					input = JOptionPane.showInputDialog("Ques 2 -> Select the valid statement."+printOptions(A,B,C,D)+"\nEnter your choice: ");

					if(input.equals("B"))
					{
						JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							
							input = JOptionPane.showInputDialog("Ques 2 -> Select the valid statement."+printOptions("",B,C,"")+"\nEnter your choice: ");			
							
							if(input.equals("B"))
							{
								JOptionPane.showMessageDialog(null,"CORRECT ANSWER!!");
								SCORE++;
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Wrong Answer!!");
							}
							FF++;
						}
						else
						{
							JOptionPane.showMessageDialog(null,"You already used this LifeLine.");
							input = JOptionPane.showInputDialog("Ques 2 -> Select the valid statement."+printOptions(A,B,C,D)+"\nEnter your choice: ");
							if(input.equals("B"))
							{
								JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Wrong Answer.");
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
						JOptionPane.showMessageDialog(null,"Wrong Answer.");
					}

                case 3:
                    A="java.lang.Object";
                    B="java.lang.String";
                    C="java.lang.util";
                    D="None";
					
					

					input = JOptionPane.showInputDialog("Ques 3 -> In which of the following is toString() method defined?."+printOptions(A,B,C,D)+"\nEnter your choice: ");

					if(input.equals("A"))
					{
						JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							
							input = JOptionPane.showInputDialog("Ques 3 -> In which of the following is toString() method defined?."+printOptions(A,B,"","")+"\nEnter your choice: ");			
							
							if(input.equals("A"))
							{
								JOptionPane.showMessageDialog(null,"CORRECT ANSWER!!");
								SCORE++;
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Wrong Answer!!");
							}
							FF++;
						}
						else
						{
							JOptionPane.showMessageDialog(null,"You already used this LifeLine.");
							input = JOptionPane.showInputDialog("Ques 3 -> In which of the following is toString() method defined?."+printOptions(A,B,C,D)+"\nEnter your choice: ");
							if(input.equals("A"))
							{
								JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Wrong Answer.");
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
						JOptionPane.showMessageDialog(null,"Wrong Answer.");
					}
				
                case 4:
                    A="True";
                    B="False";
                    C="An int value";
                    D="None";
					
					

					input = JOptionPane.showInputDialog("Ques 4 -> compareTo() returns"+printOptions(A,B,C,D)+"\nEnter your choice: ");

					if(input.equals("C"))
					{
						JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							
							input = JOptionPane.showInputDialog("Ques 4 -> compareTo() returns"+printOptions(A,"",C,"")+"\nEnter your choice: ");			
							
							if(input.equals("C"))
							{
								JOptionPane.showMessageDialog(null,"CORRECT ANSWER!!");
								SCORE++;
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Wrong Answer!!");
							}
							FF++;
						}
						else
						{
							JOptionPane.showMessageDialog(null,"You already used this LifeLine.");
							input = JOptionPane.showInputDialog("Ques 4 -> compareTo() returns"+printOptions(A,B,C,D)+"\nEnter your choice: ");
							if(input.equals("C"))
							{
								JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Wrong Answer.");
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
						JOptionPane.showMessageDialog(null,"Wrong Answer.");
					}
				
                case 5:
                    	A="Int";
					B="Void";
					C="Double";
					D="None";
					
					input = JOptionPane.showInputDialog("Ques 5 -> Identify the return type of a method that does not return any value."+printOptions(A,B,C,D)+"\nEnter your choice: ");

					if(input.equals("B"))
					{
						JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							
							input = JOptionPane.showInputDialog("Ques 5 -> Identify the return type of a method that does not return any value."+printOptions(A,B,"","")+"\nEnter your choice: ");			
							
							if(input.equals("B"))
							{
								JOptionPane.showMessageDialog(null,"CORRECT ANSWER!!");
								SCORE++;
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Wrong Answer!!");
							}
							FF++;
						}
						else
						{
							JOptionPane.showMessageDialog(null,"You already used this LifeLine.");
							input = JOptionPane.showInputDialog("Ques 5 -> Identify the return type of a method that does not return any value."+printOptions(A,B,C,D)+"\nEnter your choice: ");
							if(input.equals("B"))
							{
								JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
								SCORE++;
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Wrong Answer.");
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
						JOptionPane.showMessageDialog(null,"Wrong Answer.");
					}


					
						
			}//end of switch
		
			JOptionPane.showMessageDialog(null,"\nYou won " +SCORE + " Lakh!");
			
		}//end of if
		else
		{
			out.println("Wrong Password!.. Quit!!.");
			Runtime run = Runtime.getRuntime();
			run.exec("c:/windows/system32/rundll32.exe  user32.dll , LockWorkStation");
		}
	}//end of main 
}//end of class