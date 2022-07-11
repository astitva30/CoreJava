import javax.swing.JOptionPane;
class Student
{
	static public void main(String...ar)
	{
		String password = JOptionPane.showInputDialog("Enter Password: ");
		if(password.equals("abc123"))
		{
			int rollNo = Integer.parseInt(JOptionPane.showInputDialog("Enter Roll Number:"));
			String stuName = JOptionPane.showInputDialog("Enter Student Name: ");
			float per = Float.parseFloat(JOptionPane.showInputDialog("Enter percentage: "));
			JOptionPane.showMessageDialog(null,rollNo+" " + stuName +" " +per);			
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Invalid Password");
		}
	}
}