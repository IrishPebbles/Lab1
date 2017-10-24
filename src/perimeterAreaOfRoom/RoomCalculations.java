package perimeterAreaOfRoom;

import java.util.Scanner;

public class RoomCalculations {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		double length = 0;
		double width = 0;
		double height = 0;

		char userData = '-';

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();

		do {
			System.out.print("Enter Length: ");
			length = scnr.nextDouble();

			System.out.print("Enter Width: ");
			width = scnr.nextDouble();

			System.out.println("Area: " + (width * length));
			System.out.println("Perimeter: " + ((2 * width) + (2 * length)));
			System.out.println("Volume: " + (width * length * height));
			System.out.println();

			do {
				System.out.print("Continue? (y/n): ");
				userData = scnr.next().charAt(0);
				System.out.println();
			} while (userData != 'n' && userData != 'N' && userData != 'y' && userData != 'Y');

		} while (userData != 'n' && userData != 'N');

		scnr.close();
	}

}
