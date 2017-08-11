import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class CodingExercise1 {
	public static void main(String[] args) {
		String color=JOptionPane.showInputDialog("What color do you want the robot to draw with? Out of the six basic colors of the rainbow?");
		Robot squareDrawer=new Robot();
		squareDrawer.moveTo(300, 500);
		if(color.equalsIgnoreCase("Red")){
			squareDrawer.setPenColor(Color.red);
		}else if(color.equalsIgnoreCase("Orange")){
			squareDrawer.setPenColor(Color.orange);
		}else if(color.equalsIgnoreCase("Yellow")){
			squareDrawer.setPenColor(Color.yellow);
		}else if(color.equalsIgnoreCase("Green")){
			squareDrawer.setPenColor(Color.green);
		}else if(color.equalsIgnoreCase("Blue")){
			squareDrawer.setPenColor(Color.blue);
		}else if(color.equalsIgnoreCase("Purple")){
			squareDrawer.setPenColor(Color.magenta);
		}
		squareDrawer.penDown();
		squareDrawer.setPenWidth(10);
		
		squareDrawer.setSpeed(50);
		for(int x=0; x<4; x++) {
		squareDrawer.move(400);
		squareDrawer.turn(90);
	
		}
	}
		
}
