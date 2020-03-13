import javax.swing.JOptionPane;

public class InputUtility {


	public InputUtility()
	{
		
	}
	
	
	public static boolean getDouble(Double number)
	{
		
		if((number>=0 && number<=500))
		{
			return true;
		}else
		{
			JOptionPane.showMessageDialog(null, "Incorrect price input");
			return false;
		}
	}
	
	
	
}


