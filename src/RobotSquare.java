import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) throws Exception {

	// 1. Make a new Robot
		Robot joe=new Robot();
		// 3. Put the robot's pen down
		joe.penDown();
		// 6. Make the robot move as fast as possible
		joe.setSpeed(10);
		// 5. Do everything below here 4 times

		// 		2. Move your robot 200 pixels
	
		// 		4. Turn the robot 90 degrees to the right (90 degrees)
		
		for (int i = 0; i < 4; i++) {
			joe.move(200);
			joe.turn(90);
			System.out.println("Hello");
		}
		
	}
}

