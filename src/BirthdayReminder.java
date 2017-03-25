 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 28th";
		String dadsBirthday = "April 1st";
		String myBirthday = "October 30th";

		// 2. Find out which birthday the user wants and and store their response in a variable

		// 3. Print out what the user typed
		String answer=JOptionPane.showInputDialog("Who's birthday do you want me to remind you?");
		
	if(answer.equals("mom")){
		JOptionPane.showMessageDialog(null, momsBirthday);
	}if(answer.equals("dad")){
		JOptionPane.showMessageDialog(null, dadsBirthday);
	}if(answer.equals("mine")){
		JOptionPane.showMessageDialog(null, myBirthday);
	}
	else{
		JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday.");
	}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}