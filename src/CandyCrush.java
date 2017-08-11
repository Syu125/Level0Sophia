//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		String something=JOptionPane.showInputDialog("Who do you not like?");
		JOptionPane.showMessageDialog(null, "But I see you hanging out with "+something+" all the time.");
		String thing=JOptionPane.showInputDialog("What is your best friend's name?");
		JOptionPane.showMessageDialog(null, "I have met your friend. "+thing+ " is a nice person.");

	} 
}
