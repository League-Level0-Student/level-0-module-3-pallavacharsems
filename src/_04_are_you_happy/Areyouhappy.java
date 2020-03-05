package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Areyouhappy {
	public static void main(String[] args) {

		String response = JOptionPane.showInputDialog("Are you happy?");
		if (response.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");

		} else if (response.equalsIgnoreCase("No")) {

			String sr = JOptionPane.showInputDialog("Do you want to be happy?");
			if (sr.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
				
			} else if (sr.equalsIgnoreCase("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever your doing");
				
				
				
			}
		}

	}
}
