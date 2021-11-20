package com.gambler;

public class Gamble {

	double amount = 100d; // Amount gambler starts off with
	final double BETTING_AMOUNT = 1d; // The betting amount is always fixed to 1
	final double BETTING_RANGE_WIN = 150d; // The upper limit of the amount 
	final double BETTING_RANGE_LOSE = 50d; // The lower limit of the amount
	double winnings = 0;
	
	int wins = 0;
	int winMax = 0;
	int loss = 0;
	int lossMax = 0;
	
	int luckyDay = 0;
	int worstDay = 0;
	
	//The gamble function allows the user to win
	public void round() {
		int win = (int)(Math.random() * 2); // We are setting a gamble variable that is randomly set to 0 or 1
		
		// If win is equal to 1 it means he has won the gamble
		if (win == 1) {
			amount += BETTING_AMOUNT;
			wins++;
//			System.out.println(" Player won this round");
		}
		// If win is equal to 0 it means he has lost the gamble
		else {
			amount -= BETTING_AMOUNT;
			loss++;
//			System.out.println(" Player lost this round");
		}		
	}
	
	public void gamble() {
		
		// Gambler stops if the amount is increased or decreased by 50%
		while (amount > BETTING_RANGE_LOSE && amount < BETTING_RANGE_WIN) {
			round();
		}
		
		// Update total winning amount for this day
		if(amount == 150) {
			winnings += 50;
			System.out.println("\n Gambler won 50$ today");
		}
		else {
			winnings -= 50;
			System.out.println("\n Gambler lost 50$ today");
		}
	}
	
	public void gambleForMonth() {
		
		//We gamble for 30 days
		for (int days = 0; days < 30; days++) {
			gamble();			
			// We set the new luckiest day
			if(wins > winMax) {
				winMax = wins;
				luckyDay = days + 1;
			}
			
			// We set the new unluckiest day
			if(loss > lossMax) {
				lossMax = loss;
				worstDay = days + 1;
			}
			
			wins = 0;
			loss = 0;
			
			// Display total winnings so far
			if (winnings >= 0) 
				System.out.println(" DAY " + days + "The gambler has won " + winnings + " so far");
			else
				System.out.println(" DAY " + days + " The gambler has lost " + (-winnings) + " so far");
			amount = 100d;
		}
		
		// Display the luckiest and unluckiest day 
		System.out.println(" The luckiest day you had was day " + luckyDay + " with winnings of " + winMax);
		System.out.println(" The worst day you had was day " + worstDay + " with losses of " + lossMax);
	}
	
	public void shouldTheyGamble() {
		
		do{
			System.out.println("\n ==> Decided to play for one more month");
			gambleForMonth();
		}while (winnings > 0);
	}
	
}
