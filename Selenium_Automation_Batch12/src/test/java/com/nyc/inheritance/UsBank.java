package com.nyc.inheritance;

public interface UsBank {
	
// If you want to open a new bank you have following the gov role 
	
	public void checkingAccount();
	
	public void savingAccount();
	
	public void creditAccount();
	
	public void loanAccount();
	
	default  void studentLoan() {
		
	}

}
