package extra;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {

		String birthday = JOptionPane.showInputDialog("When is your b-day?");

		if (birthday.equals("6/19/18")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday");

		} else {
			JOptionPane.showMessageDialog(null, "Merry unbirthday");
		}

	}
}
