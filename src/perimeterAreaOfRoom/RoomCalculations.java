package perimeterAreaOfRoom;

import java.util.Scanner;

public class RoomCalculations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double length = 0;
		double width = 0;
		double height = 0;

		System.out.println("Welcome to the Room Detail Generator!");

		do {
			
			length = Validator.getDouble(sc, "Enter Length: ");
			width = Validator.getDouble(sc, "Enter Width: ");
			height = Validator.getDouble(sc, "Enter Height: ");
			
			System.out.println("\nYour room measurements are: ");
			System.out.println(area(length, width));
			System.out.println(perimeter(length, width));
			System.out.println(volume(length, width, height));
			System.out.println();

		} while (Validator.getYorN(sc, "Continue? (y/n): "));

		sc.close();
	}
	
	private static String area(double length, double width) {
		return "Area: " + (length * width);
		}
	private static String perimeter(double length, double width) {
		return "Perimeter: " + ((2 * width) + (2 * length));
		}
	private static String volume(double length, double width, double height) {
		return "Volume: " + (width * length * height);
		}

}
