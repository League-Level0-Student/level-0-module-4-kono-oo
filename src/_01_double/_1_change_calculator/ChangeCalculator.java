package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		int nickels = Integer.parseInt(JOptionPane.showInputDialog("how many nickels do you have??"));
		int dimes = Integer.parseInt(JOptionPane.showInputDialog("how many dimes do you have??"));
		int quarters = Integer.parseInt(JOptionPane.showInputDialog("how many quarters do you have??"));
		double total = (0.05*nickels + 0.10*dimes + 0.25*quarters);
		System.out.println(total);
		JOptionPane.showMessageDialog(null, "you have $"+total);
		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

