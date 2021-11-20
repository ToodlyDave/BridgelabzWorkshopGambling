package com.gambler;

public class GamblerMainTest {
	
	static double amount = 100d;
	static final double BETTING_AMOUNT = 1;
	
	public static void gamble() {
		int win = (int)(Math.random() * 2);
		
		if (win == 1) {
			amount += BETTING_AMOUNT;
		}
		else
			amount -= BETTING_AMOUNT;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gamble();
	}

}
