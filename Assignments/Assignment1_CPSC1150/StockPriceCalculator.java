/**
** Program Name: StockPriceCalculator
** Author: Quang Tran
** Date: September 10th 2025
** Course: CPSC1150
**/

import java.util.Scanner;

public class StockPriceCalculator
{
	/**
	** This program calculates the cummulative values for stock prices
	**/
	public static void main(String args[])
	{
		float stocks, commission;
		int shares;
		
		//Asks the user to enter amount of stocks they wish to buy
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount of shares");
		shares = input.nextInt();
		
		//Asks the user to enter the price of each stock
		System.out.println("Enter stock price");
		stocks = input.nextFloat();
		
		//Asks the user to enter the commission the brokerage takes
		System.out.println("Enter commission rate as a percentage eg. 1% being 0.01");
		commission = input.nextFloat();
		
		/*Calculates and displays the values of stocks before and after commission,
		aswell as displaying the total commision rate in a dollar amount*/
		System.out.println("Value of share: " + stocks * shares);
		System.out.println("Comission: " + stocks * shares * commission);
		System.out.println("Net proceeds: " + (stocks * shares) * (1.0 - commission));
	}
	}