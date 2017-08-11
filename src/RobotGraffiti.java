import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot creator=new Robot();
		creator.setSpeed(8);
		creator.move(200);
		creator.penDown();
		for (int i = 0; i < 27; i++) {
			creator.setSpeed(8);
			creator.turn(-10);
			creator.move(10);

}
			for (int j = 0; j < 30; j++) {
				creator.setSpeed(8);
				creator.turn(10);
				creator.move(10);
		}
			creator.penUp();
			creator.move(160);
			creator.turn(60);
			creator.move(100);
			creator.turn(50);
			creator.penDown();
			creator.move(150);
			creator.turn(90);
			creator.move(150);
			creator.turn(180);
			creator.move(150);
			
		}
		
	}

