/*
	Name:		Muhammad Qasim Ali.
	Reg#:		Sp21-BCS-066
	Program:    Distribution of Apples among given Students.
*/


import java.util.*;
public class Activity4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Input the number of students and apples
		System.out.print("Enter the number of students : ");
		int totalStudents = input.nextInt();
		System.out.print("Enter the number of apples : ");
		int totalApples = input.nextInt();

		// Calcualtion
		int eachStudentGetApple = totalApples/totalStudents;
		int remainingApple = totalApples%totalStudents;

		// Printing result
		System.out.println("Each Student get "+eachStudentGetApple+" Apples.");
		System.out.println("Remaining Apples are "+remainingApple);
	}
}