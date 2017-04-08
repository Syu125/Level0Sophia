import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration
 * information at the check-in counter and print their boarding pass. You need
 * to collect the following information: First name Last name Destination
 * airport Birthday (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY,
 * M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			String firstName = JOptionPane.showInputDialog("Enter your First Name.");
			String lastName = JOptionPane.showInputDialog("Enter your Last Name.");
			String destination = JOptionPane.showInputDialog("Enter your destination.");
			String birthday = JOptionPane.showInputDialog("Enter your birthday: Month(#)/Day/Year");
			String gender = JOptionPane.showInputDialog("Enter your gender.");

			JOptionPane.showMessageDialog(null, lastName + "/" + firstName + " ( " + birthday + " ;" + gender + ")");
			JOptionPane.showMessageDialog(null, "Traveling to: " + destination);
			JOptionPane.showMessageDialog(null, "Number of Passengers: " + i);
		}
		JOptionPane.showMessageDialog(null, "Sorry,this airplane is full.");
	}
}
/**
 * Extra Difficult Challenge: have the program repeat until plane is full (10
 * passenger plan) and print out the number of passengers after each boarding
 * pass.
 */
