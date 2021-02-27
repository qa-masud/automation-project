package com.nyc.inheritance;

public class TDBank implements UsBank{

	@Override
	public void checkingAccount() {
		System.out.println("TDBank Checking deposit - $ 100");
		
	}

	@Override
	public void savingAccount() {
		System.out.println("TDBank Checking deposit - $ 200");
		
	}

	@Override
	public void creditAccount() {
		System.out.println("TDBank Checking deposit - $ 500");
		
	}

	@Override
	public void loanAccount() {
		System.out.println("TDBank Checking deposit - $ 10000");
		
	}
	
	public static void main(String[] args) {
		TDBank obj = new TDBank();
		obj.checkingAccount();
		obj.savingAccount();
		obj.loanAccount();
		obj.creditAccount();
	}
}
