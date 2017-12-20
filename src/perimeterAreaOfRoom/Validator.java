package perimeterAreaOfRoom;

import java.util.ArrayList;
import java.util.Scanner;

public class Validator {

	/**
	 * Gets an integer, validates that it's a valid number, then returns that
	 * number. This is useful when prompting the user to enter an integer.
	 * 
	 * @param sc
	 *            scanner
	 * @param prompt
	 *            prompt to display to the user
	 * @return integer
	 */

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	/**
	 * Gets an integer, validates that it's a valid number, then returns that
	 * number. This is useful when prompting the user to enter an integer.
	 * 
	 * @param sc
	 *            scanner
	 * @param prompt
	 *            prompt to display to the user
	 * @param min
	 *            lowest allowed number in range
	 * @param max
	 *            highest allowed number in range
	 * @return integer
	 */

	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}
	
	/**
	 * Gets a number, validates that it's a valid decimal number, then returns that
	 * number. This is useful when prompting the user to enter an double.
	 * 
	 * @param sc
	 *            scanner
	 * @param prompt
	 *            prompt to display to the user
	 * @return integer
	 */
	
	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	/**
	 * Gets a string, validates that it's y/n, then returns true or false. This is
	 * useful when prompting the user to enter yes/no.
	 * 
	 * @param sc
	 *            scanner
	 * @param prompt
	 *            prompt to display to the user
	 * @return true for yes and false for no
	 */

	public static boolean getYorN(Scanner sc, String prompt) {
		System.out.println(prompt);

		ArrayList<String> validOptions = new ArrayList<>();
		validOptions.add("y");
		validOptions.add("n");
		validOptions.add("Y");
		validOptions.add("N");

		String s;

		do {
			s = sc.next(); // read user entry
			sc.nextLine(); // discard any other data entered on the line

			if (!validOptions.contains(s)) {
				System.out.println("You must enter one of the following options: " 
						+ validOptions.toString() + ". Please try again.");
			}
		} while (!validOptions.contains(s));

		return s.equalsIgnoreCase("y");
	}

}