package com.gambler;

public class GamblerMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Welcome to the Gambler simulator");
		
		Gambler gambler = new Gambler();
		System.out.println(" Gambler starts off with " + gambler.getAmount() + " every day");
		System.out.println(" They place a bet of " + gambler.getBETTING_AMOUNT());
	}

}
