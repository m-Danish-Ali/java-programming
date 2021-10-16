/*
	Name:		Muhammad Qasim Ali.
	Reg#:		Sp21-BCS-066
	Program:    Convert minutes to HH:MM format.
*/

import java.util.*;
public class Activity6{
	public static void main(String[] args) {
		int numberofMinute;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes passed since midmight : ");
		numberofMinute = input.nextInt();

		// Divide the entered minute by 60 to convert it to hours and then took module to find remaining minutes.
		int hours = numberofMinute/60;
		int minutes = numberofMinute%60;

		System.out.println("Now time is : "+hours+":"+minutes);
	}
}