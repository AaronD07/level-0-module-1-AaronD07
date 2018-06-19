package extra;

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		if (name.equals("Aidan")) {
			JOptionPane.showMessageDialog(null, "You're a great teacher.");
		}
		if (name.equals("Isaac")) {
			JOptionPane.showMessageDialog(null, "You're good at sports.");
		}
		if (name.equals("Milan")) {
			JOptionPane.showMessageDialog(null, "You're A great friend and you always entertain me.");
		}
		if (name.equals("Roshan")) {
			JOptionPane.showMessageDialog(null, "You're a great friend and you have great insight.");

		} else {
			JOptionPane.showMessageDialog(null, "You're a person.");
		}
	}
}
