import org.teachingextensions.logo.Tortoise;

// Copyright Wintriss Technical Schools 2014

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge.
 */

public class Starz {

	public static void main(String[] args) {

		// 1. Set the X position of the Tortoise so that it starts on the left.
		// You also need to show the Tortoise to see the result of this line.
		Tortoise.setX(10);
		Tortoise.show();

		// 2. Make the Tortoise draw a star shape. Hint: 144.
		Tortoise.turn(90);
		for (int j = 0; j < 7; j++) {
			for (int i = 0; i < 5; i++) {
				Tortoise.move(30);
				Tortoise.turn(144);
			}
			Tortoise.penUp();
			Tortoise.move(80);
			Tortoise.penDown();
		}
		System.out.println(Tortoise.getX());
		System.out.println(Tortoise.getY());

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
