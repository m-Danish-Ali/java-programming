/*
	Name:		Muhammad Qasim Ali.
	Reg#:		Sp21-BCS-066
	Program:    Activity # 7.
*/


import java.util.*;
public class Activity7{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the total amount of milk produced in the morning :");
		double milkProduced = input.nextDouble();

		// Carton required to hold the milk.
		int cartonRequired = (int)(Math.round(milkProduced/ 3.78));

		// Total cost of the milk
		double cost = milkProduced * 0.38;

		// Profit on milk
		double profit = cartonRequired * 0.27;

		System.out.println("The number of milk cartons needed to hold milk : "+cartonRequired);
		System.out.println("The cost of producing milk : "+cost);
		System.out.println("The profit for producing milk : "+profit);
	}
}