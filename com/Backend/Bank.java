package com.Backend;

public class Bank {
	
	static int currentBalence = 1000;  //variables
	
	public static void greetCustomer() {
		System.out.println("Hello, Welcome to the Banking Application");
	}
	
	public void deposite(int amount) {
		currentBalence = currentBalence + amount;
		System.out.println("Amount is deposite successfully");
	}
	public static void withdrawl(int amount) {
		currentBalence = currentBalence - amount;
		System.out.println("Amount is withdrawl successfully");
	}
	public int getCurrentBalence() {
		return currentBalence;  //void is a return type it doesn't return any values
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		greetCustomer();
		System.out.println("CurrentBalence is "+bank.getCurrentBalence());
		bank.deposite(500);
		System.out.println("CurrentBalence is "+bank.getCurrentBalence());
		withdrawl(300);
		System.out.println("CurrentBalence is "+bank.getCurrentBalence());
	}

}