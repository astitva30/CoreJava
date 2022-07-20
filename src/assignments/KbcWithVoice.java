import java.util.Date;
import static java.lang.System.out;
import javax.swing.JOptionPane;
import javax.media.Player;
import javax.media.Manager;
import java.io.File;
class KbcWithVoice
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
		
		Player play1 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657865200424-voicemaker.in-speech.wav").toURI().toURL());
		Player play2 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657865495836-voicemaker.in-speech.wav").toURI().toURL());
		Player play3 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657865670117-voicemaker.in-speech.wav").toURI().toURL());
		Player play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
		Player play5;// = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
		Player play6;// = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657968101556-voicemaker.in-speech.wav").toURI().toURL());		//sorry, you already used this lifeline
		Player play7;// = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657968749119-voicemaker.in-speech.wav").toURI().toURL());		//50-50 activated 
		Player play8;// = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657969100751-voicemaker.in-speech.wav").toURI().toURL());		//You won the displayed amount

		play1.start();
		// Thread.sleep(1000);
		String password = JOptionPane.showInputDialog("Enter password: ");
		play1.stop();
		

		if(password.equals("Abc123"))
		{
			play2.start();
			Thread.sleep(3000);
			play2.stop();
			play3.start();
			// Thread.sleep(17000);
			JOptionPane.showMessageDialog(null,"Correct Password!.. you are ready to Play!!.\n--------------------WELCOME TO KAUN BANEGA CROREPATI--------------------\n->   You will be given 10 questions and each correct answer will reward you 1 Lakhs!\n->   There will be 2 LifeLines to help you out and they can be used only once!\n->   How to use LifeLines?\tType FF in choice to use 50-50\tType FQ in choice to use flip the question lifeline.\n->   Enter the correct option to submit your answer.\n");
			play3.stop();
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

                    Player play9 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657969354816-voicemaker.in-speech.wav").toURI().toURL());		//ques1
                    play9.start();
                    // Thread.sleep(4000);
					input = JOptionPane.showInputDialog("Ques 1 -> What is the size of float and double in java?"+printOptions(A,B,C,D)+"\nEnter your choice: ");
                    play9.stop();

					if(input.equals("A"))
					{
						//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
						play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                        play4.start();
                        Thread.sleep(1000);
						play4.stop();
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							play7 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657968749119-voicemaker.in-speech.wav").toURI().toURL());		//50-50 activated 
                            play7.start();
                            Thread.sleep(4000);
                            play7.stop();
							input = JOptionPane.showInputDialog("Ques 1 -> What is the size of float and double in java?"+printOptions(A,"",C,"")+"\nEnter your choice: ");			
							
							if(input.equals("A"))
							{
								//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
						        play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                                play4.start();
                                Thread.sleep(1000);
						        play4.stop();
						        SCORE++;
							}
							else
							{
								//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
								play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                                play5.start();
								Thread.sleep(1000);
								play5.stop();
							}
							FF++;
						}
						else
						{
							// JOptionPane.showMessageDialog(null,"You already used this LifeLine.");
                            play6 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657968101556-voicemaker.in-speech.wav").toURI().toURL());
                            play6.start();
                            Thread.sleep(3000);
                            play6.stop();
							input = JOptionPane.showInputDialog("Ques 1 -> What is the size of float and double in java?"+printOptions(A,B,C,D)+"\nEnter your choice: ");
							if(input.equals("A"))
							{
								//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
                                    play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                                    play4.start();
                                    Thread.sleep(1000);
                                    play4.stop();
                                    SCORE++;
							}
							else
							{
								//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
								play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                                play5.start();
								Thread.sleep(1000);
								play5.stop();
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
						//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
                        play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                        play5.start();
                        Thread.sleep(1000);
                        play5.stop();
					}


                case 2:
					A="char[] ch = new char(5)";
					B="char[] ch = new char[5]";
					C="char[] ch = new char()";
					D="char[] ch = new char[]";
					
					
                    Player play10 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657969560914-voicemaker.in-speech.wav").toURI().toURL());		//ques2
                    play10.start();
                    // Thread.sleep(3000);
					input = JOptionPane.showInputDialog("Ques 2 -> Select the valid statement."+printOptions(A,B,C,D)+"\nEnter your choice: ");
                    play10.stop();

					if(input.equals("B"))
					{
						//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
						play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                        play4.start();
                        Thread.sleep(1000);
						play4.stop();
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							play7 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657968749119-voicemaker.in-speech.wav").toURI().toURL());		//50-50 activated 
                            play7.start();
                            Thread.sleep(4000);
                            play7.stop();
							input = JOptionPane.showInputDialog("Ques 2 -> Select the valid statement."+printOptions("",B,C,"")+"\nEnter your choice: ");			
							
							if(input.equals("B"))
							{
								//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
                                play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                                play4.start();
                                Thread.sleep(1000);
                                play4.stop();
                                SCORE++;
							}
							else
							{
								//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
								play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                                play5.start();
								Thread.sleep(1000);
								play5.stop();
							}
							FF++;
						}
						else
						{
							// JOptionPane.showMessageDialog(null,"You already used this LifeLine.");
                            play6 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657968101556-voicemaker.in-speech.wav").toURI().toURL());
                            play6.start();
                            Thread.sleep(3000);
                            play6.stop();
							input = JOptionPane.showInputDialog("Ques 2 -> Select the valid statement."+printOptions(A,B,C,D)+"\nEnter your choice: ");
							if(input.equals("B"))
							{
								//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
                                play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                                play4.start();
                                Thread.sleep(1000);
                                play4.stop();
                                SCORE++;
							}
							else
							{
								//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
								play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                                play5.start();
								Thread.sleep(1000);
								play5.stop();
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
						//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
                        play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                        play5.start();
                        Thread.sleep(1000);
                        play5.stop();
					}

                case 3:
                    A="java.lang.Object";
                    B="java.lang.String";
                    C="java.lang.util";
                    D="None";
					
					
                    Player play11 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657969848871-voicemaker.in-speech.wav").toURI().toURL());		//ques3
                    play11.start();
                    // Thread.sleep(5000);
					input = JOptionPane.showInputDialog("Ques 3 -> In which of the following is toString() method defined?."+printOptions(A,B,C,D)+"\nEnter your choice: ");
                    play11.stop();

					if(input.equals("A"))
					{
						//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
						play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                        play4.start();
                        Thread.sleep(1000);
						play4.stop();
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							play7 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657968749119-voicemaker.in-speech.wav").toURI().toURL());		//50-50 activated 
                            play7.start();
                            Thread.sleep(4000);
                            play7.stop();
							input = JOptionPane.showInputDialog("Ques 3 -> In which of the following is toString() method defined?."+printOptions(A,B,"","")+"\nEnter your choice: ");			
							
							if(input.equals("A"))
							{
								//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
                                play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                                play4.start();
                                Thread.sleep(1000);
                                play4.stop();
                                SCORE++;
							}
							else
							{
								//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
								play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                                play5.start();
								Thread.sleep(1000);
								play5.stop();
							}
							FF++;
						}
						else
						{
							// JOptionPane.showMessageDialog(null,"You already used this LifeLine.");
                            play6 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657968101556-voicemaker.in-speech.wav").toURI().toURL());
                            play6.start();
                            Thread.sleep(3000);
                            play6.stop();
							input = JOptionPane.showInputDialog("Ques 3 -> In which of the following is toString() method defined?."+printOptions(A,B,C,D)+"\nEnter your choice: ");
							if(input.equals("A"))
							{
								//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
                                play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                                play4.start();
                                Thread.sleep(1000);
                                play4.stop();
                                SCORE++;
							}
							else
							{
								//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
								play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                                play5.start();
								Thread.sleep(1000);
								play5.stop();
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
						//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
                        play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                        play5.start();
                        Thread.sleep(1000);
                        play5.stop();
					}
				
                case 4:
                    A="True";
                    B="False";
                    C="An int value";
                    D="None";
					
					Player play12 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657970066754-voicemaker.in-speech.wav").toURI().toURL());		//ques4
                    play12.start();
                    // Thread.sleep(4000);
					input = JOptionPane.showInputDialog("Ques 4 -> What does compareTo() returns"+printOptions(A,B,C,D)+"\nEnter your choice: ");
                    play12.stop();


					if(input.equals("C"))
					{
						//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
						play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                        play4.start();
                        Thread.sleep(1000);
						play4.stop();
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							play7 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657968749119-voicemaker.in-speech.wav").toURI().toURL());		//50-50 activated 
                            play7.start();
                            Thread.sleep(4000);
                            play7.stop();
							input = JOptionPane.showInputDialog("Ques 4 -> compareTo() returns"+printOptions(A,"",C,"")+"\nEnter your choice: ");			
							
							if(input.equals("C"))
							{
								//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
                                play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                                play4.start();
                                Thread.sleep(1000);
                                play4.stop();
                                SCORE++;
							}
							else
							{
								//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
								play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                                play5.start();
								Thread.sleep(1000);
								play5.stop();
							}
							FF++;
						}
						else
						{
                            // JOptionPane.showMessageDialog(null,"You already used this LifeLine.");
                            play6 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657968101556-voicemaker.in-speech.wav").toURI().toURL());
                            play6.start();
                            Thread.sleep(3000);
                            play6.stop();
							input = JOptionPane.showInputDialog("Ques 4 -> compareTo() returns"+printOptions(A,B,C,D)+"\nEnter your choice: ");
							if(input.equals("C"))
							{
								//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
                                play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                                play4.start();
                                Thread.sleep(1000);
                                play4.stop();
                                SCORE++;
							}
							else
							{
								//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
								play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                                play5.start();
								Thread.sleep(1000);
								play5.stop();
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
						//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
                        play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                        play5.start();
                        Thread.sleep(1000);
                        play5.stop();
					}
				
                case 5:
                    A="Int";
					B="Void";
					C="Double";
					D="None";
					
                    Player play13 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657970172656-voicemaker.in-speech.wav").toURI().toURL());		//ques5
                    play13.start();
                    // Thread.sleep(5000);
					input = JOptionPane.showInputDialog("Ques 5 -> Identify the return type of a method that does not return any value."+printOptions(A,B,C,D)+"\nEnter your choice: ");
                    play13.stop();

					if(input.equals("B"))
					{
						//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
						play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                        play4.start();
                        Thread.sleep(1000);
						play4.stop();
						SCORE++;
					}
					else if(input.equals("FF"))
					{
						if(FF==0)
						{
							play7 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657968749119-voicemaker.in-speech.wav").toURI().toURL());		//50-50 activated 
                            play7.start();
                            Thread.sleep(4000);
                            play7.stop();
							input = JOptionPane.showInputDialog("Ques 5 -> Identify the return type of a method that does not return any value."+printOptions(A,B,"","")+"\nEnter your choice: ");			
							
							if(input.equals("B"))
							{
								//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
                                play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                                play4.start();
                                Thread.sleep(1000);
                                play4.stop();
                                SCORE++;
							}
							else
							{
								//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
								play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                                play5.start();
								Thread.sleep(1000);
								play5.stop();
							}
							FF++;
						}
						else
						{
							// JOptionPane.showMessageDialog(null,"You already used this LifeLine.");
                            play6 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657968101556-voicemaker.in-speech.wav").toURI().toURL());
                            play6.start();
                            Thread.sleep(3000);
                            play6.stop();
							input = JOptionPane.showInputDialog("Ques 5 -> Identify the return type of a method that does not return any value."+printOptions(A,B,C,D)+"\nEnter your choice: ");
							if(input.equals("B"))
							{
								//JOptionPane.showMessageDialog(null,"CORRECT ANSWER");
                                play4 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657872561080-voicemaker.in-speech.wav").toURI().toURL());		//correct answer
                                play4.start();
                                Thread.sleep(1000);
                                play4.stop();
                                SCORE++;
							}
							else
							{
								//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
								play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                                play5.start();
								Thread.sleep(1000);
								play5.stop();
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
						//JOptionPane.showMessageDialog(null,"Wrong Answer!!");
                        play5 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657873128648-voicemaker.in-speech.wav").toURI().toURL());		//wrong answer
                        play5.start();
                        Thread.sleep(1000);
                        play5.stop();
					}


			}//end of switch
            play8 = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657969100751-voicemaker.in-speech.wav").toURI().toURL());		//You won the displayed amount
            play8.start();
            // Thread.sleep(2000);
			JOptionPane.showMessageDialog(null,"\nYou won " +SCORE + " Lakh!");
            play8.stop();
            System.exit(0);
		}//end of if
		else
		{
			out.println("Wrong Password!.. Quit!!.");
			Runtime run = Runtime.getRuntime();
			run.exec("c:/windows/system32/rundll32.exe  user32.dll , LockWorkStation");
		}
	}//end of main 
}//end of class