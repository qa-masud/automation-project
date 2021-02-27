package com.nyc.inheritance;

public class BankOfAmerica implements UsBank{

	@Override
	public void checkingAccount() {
		System.out.println("BankOfAmerica Checking deposit - $ 1000");
		
	}

	@Override
	public void savingAccount() {
		System.out.println("BankOfAmerica  Checking deposit - $ 500");
		
	}

	@Override
	public void creditAccount() {
		System.out.println("BankOfAmerica Checking deposit - $ 1000");
		
	}

	@Override
	public void loanAccount() {
		System.out.println("BankOfAmerica Checking deposit - $ 300000");
		
	}
public static void main(String[] args) {
	BankOfAmerica obj = new BankOfAmerica();
	obj.checkingAccount();
	obj.savingAccount();
	obj.loanAccount();
	obj.creditAccount();
}
}
