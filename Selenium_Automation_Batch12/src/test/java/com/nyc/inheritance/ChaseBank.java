package com.nyc.inheritance;

public class ChaseBank implements UsBank{

	@Override
	public void checkingAccount() {
	System.out.println("ChaseBank Checking deposit - $ 1500");
	
		
	}

	@Override
	public void savingAccount() {	
		System.out.println("ChaseBank Checking deposit - $ 1500");
	}

	@Override
	public void creditAccount() {
		System.out.println("ChaseBank Credit - $ 2000");
	}

	@Override
	public void loanAccount() {
		
		System.out.println("ChaseBank Loan amount - $ 200000");
	}

	
	public static void main(String[] args) {
		ChaseBank obj = new ChaseBank();
		obj.checkingAccount();
		obj.savingAccount();
		obj.loanAccount();
		obj.creditAccount();
	}
}
