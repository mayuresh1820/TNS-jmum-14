package com.interfacedemo;

public class AccountDemo {

	public static void main(String[] args) {
		Bank bank = new BankImpl();
		
		Account account =new Account(1001,"Mayuresh",bank);
		
		account.deposit(23000);
		System.out.println(account);
		
		account.withdraw(34000);
		System.out.println(account.getBalance());

	}

}
