import javax.swing.JOptionPane;

public class AreYouHappy2 {
	public static void main(String[] args) {
		int userAnswer = JOptionPane.showOptionDialog(null, "Are you happy?", "Pop-up Title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No" }, null);
		if (userAnswer == 0) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} else {
			int Answer = JOptionPane.showOptionDialog(null, "Do you want to be happy?", "Pop-up Title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No" },
					null);
			if (Answer == 0) {
				JOptionPane.showMessageDialog(null, "CHANGE SOMETHING!");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
	}
}
