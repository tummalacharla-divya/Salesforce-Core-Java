/*
Bank Account Management System
 
You are tasked with developing a simplified bank account management system for a small local bank. The system should allow users to create accounts, 
deposit and withdraw funds, and view account balances.
 
Requirements:
 
Account Class:
Implement the Account class, including the following:
Attributes: accountNumber, accountHolderName, balance
Methods: deposit(), withdraw(), getBalance(), getAccountNumber(), getAccountHolderName(), toString()
Account Management:
 
Create a List<Account> to store all the accounts in the bank.
 
Implement the following functionalities:
 
	1. Create Account: Allow users to create new accounts by providing the necessary information.
	2. Deposit Funds: Allow users to deposit funds into an existing account.
	3. Withdraw Funds: Allow users to withdraw funds from an existing account.
	4. View Account Balance: Allow users to view the current balance of an account.
	5. Search Account: Allow users to search for an account by account number.
	6. Display All Accounts: Display a list of all accounts in the bank.
 
Additional Considerations:
 
Error Handling: Implement proper error handling for invalid inputs (e.g., negative deposit/withdrawal amounts, insufficient funds).
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
class Account{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	public Account(String accountNumber, String accountHolderName, double balance){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposit(double amount){
		if(amount<=0){
			System.out.println("invalid deposit amount");
		}
		else{
			balance+=amount;
			System.out.println("amount deposited");
		}
	}
	
	public void withdraw(double withdraw_amount){
		if(withdraw_amount>0 && withdraw_amount<=balance){
			balance-=withdraw_amount;
			System.out.println("successful withdraw "+withdraw_amount);
		}
		else if(withdraw_amount>balance){
			System.out.println("Insufficient funds.");
		}
		else{
			System.out.println("Invalid withdraw amount");
		}
	}
	public double getBalance(){
		return balance;
	}
	public String getAccountNumber(){
		return accountNumber;
	}
	public String getAccountHolderName(){
		return accountHolderName;
	}
	
	public String toString(){
		return "Account_NO: "+accountNumber+"\n Account Holder name: "+accountHolderName+"\n balance: "+balance;
	}
	
}
class SmallBank{
	private static List<Account> accounts=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int choice;
		do{
			System.out.println("\n--- Bank Account Management System---");
			System.out.println("1. create Account");
			System.out.println("2. Deposit funds");
			System.out.println("3. withdraw funds");
			System.out.println("4. view account balance");
			System.out.println("5. search account");
			System.out.println("6. Display all accounts");
			System.out.println("7. Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			
			switch(choice){
				case 1-> createAccount();
				case 2-> depositFunds();
				case 3-> withdrawFunds();
				case 4-> viewAccountBalance();
				case 5-> searchAccount();
				case 6-> displayAllAcounts();
				case 7-> System.out.println("Exiting system. bye!");
				default-> System.out.println("Invalid choice! please try again.");
				
			}
			
		}while(choice!=7);
	}
	private static void createAccount(){
		System.out.println("Enter account number: ");
		String accountNumber=sc.nextLine();
		System.out.println("Enter account holder name: ");
		String accountHolderName=sc.nextLine();
		System.out.println("Enter initial balance: ");
		double balance=sc.nextDouble();
		
		if(balance<0){
			System.out.println("Initial balance cannot be negative.");
		}
		else{
			Account newAccount=new Account(accountNumber,accountHolderName,balance);
			accounts.add(newAccount);
			System.out.println("Account created successfully.");
		}
	}
	private static void depositFunds(){
		System.out.println("Enter account number: ");
		String accountNumber=sc.nextLine();
		Account account=findAccount(accountNumber);
		if(account!=null){
			System.out.println("Enter amount to deposit: ");
			double amount=sc.nextDouble();
			account.deposit(amount);
		}else{
			System.out.println("Account not found.");
		}
	}
	private static void withdrawFunds(){
		System.out.println("Enter account number: ");
		String accountNumber=sc.nextLine();
		Account account=findAccount(accountNumber);
		if(account!=null){
			System.out.println("Enter amount to withdraw: ");
			double amount=sc.nextDouble();
			account.withdraw(amount);
		}else{
			System.out.println("Account not found.");
		}
	}
	private static void viewAccountBalance(){
		System.out.println("Enter account number: ");
		String accountNumber=sc.nextLine();
		Account account=findAccount(accountNumber);
		if(account!=null){
			System.out.println("current balance: "+account.getBalance());
		}else{
			System.out.println("Account not found.");
		}
	}
	private static void searchAccount(){
		System.out.println("Enter account number: ");
		String accountNumber=sc.nextLine();
		Account account=findAccount(accountNumber);
		if(account!=null){
			System.out.println(account);
		}else{
			System.out.println("Account not found.");
		}
	}
	private static void displayAllAcounts(){
		if(accounts.isEmpty()){
			System.out.println("No accounts found");
		}
		else{
			System.out.println("\n-- List of Accounts --");
			for(Account account:accounts){
				System.out.println(account);
			}
		}
	}
	private static Account findAccount(String accountNumber){
		for(Account account:accounts){
			if(account.getAccountNumber().equals(accountNumber)){
				return account;
			}
		}
		return null;
	}
	
}