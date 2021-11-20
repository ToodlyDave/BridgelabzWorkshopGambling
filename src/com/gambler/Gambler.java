package com.gambler;

public class Gambler {

	private double amount;
	private final double BETTING_AMOUNT = 1;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBETTING_AMOUNT() {
		return BETTING_AMOUNT;
	}
	
	public Gambler() {
		// TODO Auto-generated constructor stub
		this.amount = 100d;
	}
	
	
}
