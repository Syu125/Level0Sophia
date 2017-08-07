import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String cats= JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
int numCats=Integer.parseInt(cats);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if(numCats >=3) {
JOptionPane.showMessageDialog(null, "You're a crazy cat lady!");	
}
		// 4. If they have 3 or less, call the method below to show them a cat video
if(numCats <3) {
	playVideo(cats);
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
if(numCats ==0) {
	playVideot(cats);
}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI("https://goo.gl/CRkQ9y");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void playVideot(String videoURL) {
		try {
			URI uri = new URI("https://goo.gl/F44HZa");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

