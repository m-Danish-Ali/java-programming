/*
	Name:		Muhammad Qasim Ali.
	Reg#:		Sp21-BCS-066
	Program:    Activity # 9.
*/

import java.util.*;
public class Activity9{
	public static void main(String[] args) {
		int classA = 20, classB = 15, classC = 10, classD = 5;
		int classAsold,classBsold,classCsold,classDsold,income;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of tickets sold according to following classes:");

		System.out.print("Class A : ");
		classAsold = input.nextInt();

		System.out.print("Class B : ");
		classBsold = input.nextInt();

		System.out.print("Class C : ");
		classCsold = input.nextInt();

		System.out.print("Class D : ");
		classDsold = input.nextInt();

		// Calculating the income on selling the different class tickets.
		income = (classA*classAsold) + (classB*classBsold) + (classC*classCsold) + (classD*classDsold);

		System.out.print("The total income generated : "+income+"$.");
	}
}
