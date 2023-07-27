package project;


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	class BankAccount {
	    private String accountNumber;
	    private String accountHolderName;
	    private double balance;

	    public BankAccount(String accountNumber, String accountHolderName) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.balance = 0.0;
	    }

	    // Getters and setters

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    @Override
	    public String toString() {
	        return "Account Number: " + accountNumber +
	               ", Account Holder Name: " + accountHolderName +
	               ", Balance: " + balance;
	    }
	}

