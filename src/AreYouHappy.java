import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String userAnswer = JOptionPane.showInputDialog("Are you happy?");
		if (userAnswer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} else {
			String Answer = JOptionPane.showInputDialog("Do you want to be happy?");
			if (Answer.equals("yes")) {
				JOptionPane.showMessageDialog(null, "CHANGE SOMETHING!");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
	}

}
