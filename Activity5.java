/*
	Name:		Muhammad Qasim Ali.
	Reg#:		Sp21-BCS-066
	Program:    Calculate Smallest possible number of desks required.
*/


import java.util.*;
public class Activity5{
	public static void main(String[] args) {
		int classA,classB,classC;
		Scanner input = new Scanner(System.in);

		// Input the given data
		System.out.print("Enter the nmber of studets in class A : ");
		classA = input.nextInt();
		System.out.print("Enter the nmber of studets in class B : ");
		classB = input.nextInt();
		System.out.print("Enter the nmber of studets in class C : ");
		classC = input.nextInt();

		// Calculation of results
		int result = 0;
		result = (int)(Math.ceil(classA/2.0));
		result+= (int)(Math.ceil(classB/2.0));
		result+= (int)(Math.ceil(classC/2.0));

		// Printing the result
		System.out.println("Smallest possible number of desks required : " + result);
	}
}