import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String something=JOptionPane.showInputDialog("Hello, what is your name?");
	JOptionPane.showMessageDialog(null, "Hi "+something+". How are you?");
}
}
