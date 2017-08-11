import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
 
import javax.swing.JOptionPane;
 
import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;
 
/** Note: You will need the latest version of the TKP jar: http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar **/
 
public class TurtleTreasureHunt implements KeyEventDispatcher {

	int tortoiseSpeed = 10;
 
	private void goUp() {
		// 1. Make the tortoise move up the screen
		Tortoise.setAngle(0);
		Tortoise.move(tortoiseSpeed);
	}
 
	private void goDown() {
		// 2. make the tortoise move down the screen
		Tortoise.setAngle(180);
		Tortoise.move(tortoiseSpeed);
	}
 
	private void goLeft() {
		// 3. make the tortoise move left
		// Hint: the turn() method lags more than setAngle()
		Tortoise.setAngle(270);
		Tortoise.move(tortoiseSpeed);
	}
 
	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.setAngle(90);
		Tortoise.move(tortoiseSpeed);
	}
 
	private void spaceBarWasPressed() {
		int X = Tortoise.getX();
		int Y = Tortoise.getY();
 
		// 5. Print out the variables for tortoiseLocationX and tortoiseLocationY
		System.out.println(X);
		System.out.println(Y);
		// 6. If tortoise is at same location as the little girl,
		// 			make a pop-up tell the Tortoise where to go next
		if(X>497 && X<515){
			if(Y>287 && Y<350){
				JOptionPane.showMessageDialog(null, "Go find the boy: he will give you a clue.");
			}
		}
		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)
		//Boy
		if(X>135 && X<155){
			if(Y>275 && Y<335){
				JOptionPane.showMessageDialog(null, "A clue is hidden in a dark cave above me.");
			}
		}
		//Skull
		if(X>115 && X<165){
			if(Y>20 && Y<60){
				JOptionPane.showMessageDialog(null, "There is a key hidden near the pond.");
			}
		}
		//Bottle
		if(X>275 && X<300){
			if(Y>365 && Y<385){
				JOptionPane.showMessageDialog(null, "Use the key to unlock a box hidden behind a sign.");
			}
		}
		//Sign
		if(X>200 && X<230){
			if(Y>140 && Y<160){
				JOptionPane.showMessageDialog(null, "You found the treasure!");
			}
		}	
}
 
	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want, and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground("file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null, "Ask the little girl for help with your quest. Press the space bar to ask.");
	}
 
	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}
 
	public static void main(String[] args) throws MalformedURLException {
		new TurtleTreasureHunt().go();
	}
}
 
