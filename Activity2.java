/*
	Name:		Muhammad Qasim Ali.
	Reg#:		Sp21-BCS-066
	Program:    Correction of given program
*/


import java.util.*;
public class Activity2{
	public static void main(String[] args) {
		// Declare the variables
		
		int width;
		int length;
		int area;
		int perimeter;

		// Input from the user.

		Scanner console = new Scanner(System.in);
		System.out.print("Enter the length: ");
		length = console.nextInt();
		System.out.print("Enter the width: ");
		width = console.nextInt();
		System.out.println();

		// Calculate the Area and perimeter of rectangle.

		area = length * width;
		perimeter = 2 * (length + width);

		// Print the Area and perimeter

		System.out.println("Area = " + area);
		System.out.println();
		System.out.println("Perimeter = " + perimeter);
	}
}
