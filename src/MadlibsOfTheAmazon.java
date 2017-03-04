import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {
		JOptionPane.showInputDialog("If you find yourself having to cross an alligator-infested river, here's what you gotta do...");
		String adjective=JOptionPane.showInputDialog("Enter an adjective.");
		String liquid=JOptionPane.showInputDialog("Enter a type of liquid.");
		String part=JOptionPane.showInputDialog("Enter a body part.");
		String verb=JOptionPane.showInputDialog("Enter a verb.");
		String place=JOptionPane.showInputDialog("enter a place.");

		JOptionPane.showInputDialog("Alligators are really "+adjective+" when someone wants to cross their river, but they get more "+adjective+" when you are carrying a bottle of "+liquid+". If you are carrying this, they will likely attack your"+part+" when you are"+verb+". If you or someone else gets injured, go to the closest "+place+" you can find. Good luck crossing!");
		
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}
