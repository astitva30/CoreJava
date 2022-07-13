import java.util.Date;
import static java.lang.System.out;
import javax.swing.JOptionPane;
/*
class Andhwishwas
{
	static
	{
		out.println(new Date());
	}

	static public void main(String...ar)
	{
		String pass = JOptionPane.showInputDialog("Enter Password:");
		
		if(pass.equals("abc123"))
		{
			int rollNo = Integer.parseInt(JOptionPane.showInputDialog("Enter Roll No.: "));
			String stuName = JOptionPane.showInputDialog("Enter your name:");
			float per =Float.parseFloat(JOptionPane.showInputDialog("Enter Percentage: "));
			JOptionPane.showMessageDialog(null,rollNo +" " + " " + stuName+" " +per);
			
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Invalid Password");
		}
	}
	
}
*/

class Andhwishwas
{
	static
	{
		out.println(new Date());
	}

	static public void main(String...ar)
	{
		String pass = JOptionPane.showInputDialog("Enter Password:");
		
		if(pass.equals("abc123"))
		{
			JOptionPane.showMessageDialog(null,"\n1-> Don't step out during an eclipse\n2-> Do not sleep with your head facing the North \n3-> Don't go near a Peepal tree in the night  \n4-> Using lemon and green chilies to avert buri nazar  \n5-> Bathe after attending a funeral ceremony\n");


			int number = Integer.parseInt(JOptionPane.showInputDialog("Enter Number to know more..."));
			switch(number)
			{
				case 1:	
					JOptionPane.showMessageDialog(null," Preventing loss of eyesight.\nObserving the Sun during a solar eclipse can cause retinal burns or eclipse blindness . \nBased on a series of observations, our ancestors probably reached the conclusion \nthat it was not advisable to set out during an eclipse.");
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"  Preventing cardiovascular diseases\nOur ancestors probably knew about the relation between Earth's magnetic field and the human body's field ( biomagnetism ).\n They probably made this rule of sleeping with your head in the South because of the harmful\n effects related to blood pressure and other diseases that asymmetry with the Earth's magnetic field would create."); 
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"  Avoid inhaling carbon dioxide\nJan van Helmont found out the recipe of plant-food in mid-17th century. Before that the world was clueless about the relation between sunlight, \ncarbon dioxide that magically produces glucose for plants. Our ancestors probably knew about \nphotosynthesis and the effects of inhaling carbon dioxide in the night.");
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"  Avoid inhaling carbon dioxide\nJan van Helmont found out the recipe of plant-food in mid-17th century. Before that the world was clueless about the relation between sunlight, \ncarbon dioxide that magically produces glucose for plants. Our ancestors probably knew about \nphotosynthesis and the effects of inhaling carbon dioxide in the night.");
					break;
				case 5:
					JOptionPane.showMessageDialog(null,"  Avoid inhaling carbon dioxide\nJan van Helmont found out the recipe of plant-food in mid-17th century. Before that the world was clueless about the relation between sunlight, \ncarbon dioxide that magically produces glucose for plants. Our ancestors probably knew about \nphotosynthesis and the effects of inhaling carbon dioxide in the night.");
					break;
				default:
					JOptionPane.showMessageDialog(null," INVALID NUMBER ");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Invalid Password");
		}
	}
	
}