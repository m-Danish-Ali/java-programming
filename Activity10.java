/*
	Name:		Muhammad Qasim Ali.
	Reg#:		Sp21-BCS-066
	Program:    Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
*/


import java.util.*;
public class Activity10{
	public static void main(String[] args) {
		int num,result,n,a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000 : ");
		num = input.nextInt();

		// Getting hundred
		a = num/100;
		n= num%100;

		// Getting tens
		b = n/10;

		// Getting ones
		c = n%10;

		// Adding hundred, tens, ones
		result=a+b+c;

		System.out.print("The sum of the digits of "+num+" is "+result);
		
	}
}