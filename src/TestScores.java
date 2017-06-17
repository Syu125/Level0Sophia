import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String Answer = JOptionPane.showInputDialog("What did you get on your test (percentage)?");
	if(Answer.equals("100")){
		JOptionPane.showMessageDialog(null, "Good Job!");
	}else{
		JOptionPane.showMessageDialog(null, "Try to improve.");
	}
}
}
