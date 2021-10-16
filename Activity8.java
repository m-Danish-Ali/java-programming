/*
	Name:		Muhammad Qasim Ali.
	Reg#:		Sp21-BCS-066
	Program:    Activity # 8.
*/

import java.util.*;
public class Activity8{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Entered data by user.
		System.out.print("Enter your pay rate per hour : ");
		double hoursRate= input.nextDouble();
		System.out.print("Enter the number of hours you work per week : ");
		double hoursPerWeek= input.nextDouble();

		// Calculating net income
		double netIncome = hoursRate * hoursPerWeek;

		// Income before and after paying tax of 14% on net income
		System.out.println("Income before tax : "+Math.round(netIncome)+"$");
		double taxpaid = netIncome * 0.14;
		double income = netIncome - taxpaid;
		System.out.println("Income after tax : "+Math.round(income)+"$");

		// 10% of net income which spend on clothes and other accessories
		double incomeSpendOnClothes = 0.10*netIncome;
		System.out.println("The money you spend on clothes and other accessories : "+Math.round(incomeSpendOnClothes)+"$");

		// 1% of net income which spend on schoolsupplies
		double schoolSupplies = 0.1*netIncome;
		System.out.println("The money you spend on school supplies : "+Math.round(schoolSupplies)+"$");

		// Remaining income after spending on tax, clothes and other supplies.
		double remainingIncome = netIncome - (taxpaid + incomeSpendOnClothes + schoolSupplies);

		// 25% of remaining income spend buying bonds
		double bondsAmount = remainingIncome * 0.25;
		System.out.println("The money you spend to buy savings bonds : " + Math.round(bondsAmount)+"$");

		// parents buying same amount of bonds which we buy but on half price
		double parentsBondsAmount = bondsAmount * 0.50;
		System.out.println("The money your parents spend to buy additional savings bonds for you : "+Math.round(parentsBondsAmount)+"$");



	}
}