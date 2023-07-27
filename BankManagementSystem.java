package project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class BankManagementSystem {
		
	    private static Map<String, BankAccount> accounts = new HashMap<>();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("Bank Management System");
	            System.out.println("1. Create Account");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Check Balance");
	            System.out.println("5. Display Account Information");
	            System.out.println("6. Exit");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character after reading the integer

	            switch (choice) {
	                case 1:
	                    createAccount();
	                    break;
	                case 2:
	                    deposit();
	                    break;
	                case 3:
	                    withdraw();
	                    break;
	                case 4:
	                    checkBalance();
	                    break;
	                case 5:
	                    displayAccountInfo();
	                    break;
	                case 6:
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private static void createAccount() {
	        System.out.print("Enter account number: ");
	        String accountNumber = scanner.next();

	        System.out.print("Enter account holder name: ");
	        String accountHolderName = scanner.next();

	        if (accounts.containsKey(accountNumber)) {
	            System.out.println("Account number already exists.");
	        } else {
	            BankAccount account = new BankAccount(accountNumber, accountHolderName);
	            accounts.put(accountNumber, account);
	            System.out.println("Account created successfully!");
	        }
	    }

	    private static void deposit() {
	        System.out.print("Enter account number: ");
	        String accountNumber = scanner.next();

	        if (accounts.containsKey(accountNumber)) {
	            System.out.print("Enter the amount to deposit: ");
	            double amount = scanner.nextDouble();

	            BankAccount account = accounts.get(accountNumber);
	            account.deposit(amount);

	            System.out.println("Deposit successful. New balance: " + account.getBalance());
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    private static void withdraw() {
	        System.out.print("Enter account number: ");
	        String accountNumber = scanner.next();

	        if (accounts.containsKey(accountNumber)) {
	            System.out.print("Enter the amount to withdraw: ");
	            double amount = scanner.nextDouble();

	            BankAccount account = accounts.get(accountNumber);
	            account.withdraw(amount);

	            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    private static void checkBalance() {
	        System.out.print("Enter account number: ");
	        String accountNumber = scanner.next();

	        if (accounts.containsKey(accountNumber)) {
	            BankAccount account = accounts.get(accountNumber);
	            System.out.println("Account balance: " + account.getBalance());
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    private static void displayAccountInfo() {
	        System.out.print("Enter account number: ");
	        String accountNumber = scanner.next();

	        if (accounts.containsKey(accountNumber)) {
	            BankAccount account = accounts.get(accountNumber);
	            System.out.println(account);
	        } else {
	            System.out.println("Account not found.");
	        }
	    }
	}


