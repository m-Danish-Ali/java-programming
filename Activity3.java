/*
	Name:		Muhammad Qasim Ali.
	Reg#:		Sp21-BCS-066
	Program:    Convert dollar to pennis, nikels, quarters, dollars, dimes.
*/


import java.util.*;
public class Activity3{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount as a decimal number, such as 11.56: ");
		double amount = input.nextDouble();

		int remainingAmount = (int)(amount*100);

		// Dollars to dollars
		int dollars = remainingAmount/100;
		remainingAmount = remainingAmount%100;

		// Remaining amount to quarters
		int quaters = remainingAmount/25;
		remainingAmount = remainingAmount%25;

		// Remaining amount to dimes
		int dimes = remainingAmount/10;
		remainingAmount = remainingAmount%10;

		// Remaining amount to nikels
		int nickels = remainingAmount/5;
		remainingAmount = remainingAmount%5;

		// Remaining amount to pennis
		int pennis = remainingAmount;

		// Output the results
		System.out.println(amount + " consist of ");
		System.out.println(dollars+ " dollars");
		System.out.println(quaters+ " quaters");
		System.out.println(dimes+ " dimes");
		System.out.println(nickels+ " nickels");
		System.out.println(pennis+ " pennis");
	}
}