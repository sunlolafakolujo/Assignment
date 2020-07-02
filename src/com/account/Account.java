package com.account;

public class Account {
	
	private int accountBalance;

	public void depositMoney(int moneyToBeDeposited) {
		if(moneyToBeDeposited>0)
		accountBalance += moneyToBeDeposited;
		
		
	}

	public int getAccountBalance() {
		
		return accountBalance;
	}

	public void ammountToWithDraw(int cashWithDrawal) {
		
		
		if(accountBalance>=cashWithDrawal) {
			accountBalance -= cashWithDrawal;
		}
		
	}

	public int minimumBalance(){
		int minimumAmount =1000; 
			
			if(accountBalance<=minimumAmount) {
				return minimumAmount;
			}
			else
				return 1000;
			
	}
		
		
	
	
	
	

} 
