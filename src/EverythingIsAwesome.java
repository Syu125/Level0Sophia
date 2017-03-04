import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
	String something=JOptionPane.showInputDialog("Type in the name of a fruit (plural form)");
	JOptionPane.showMessageDialog(null, something+" are awesome, but they're not the best.");
}
}
