import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
String answer="yes";
if(answer.equals("yes")){
	JOptionPane.showMessageDialog(null, "You rule the world.");
}else{
	JOptionPane.showMessageDialog(null, "Well then, good luck with your life.");
}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}