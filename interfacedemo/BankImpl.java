package com.interfacedemo;

public class BankImpl implements Bank{
	
	public void deposit(Account account,double amount) {
		if(amount > deposit_limit) {
			System.err.println("Sorry you cannot deposit more than 250000");
		}
		else {
			account.setBalance(account.getBalance()+amount);
			System.out.println("your account is credited with "+amount);
		}
	}
	
	public void withdraw(Account account,double amount) {
		if(account.getBalance()-amount>=deposit_limit) {
			account.setBalance(account.getBalance()-amount);
			System.out.println("The amount"+ amount + "is withdrawn from your account");
		}
	}

}
