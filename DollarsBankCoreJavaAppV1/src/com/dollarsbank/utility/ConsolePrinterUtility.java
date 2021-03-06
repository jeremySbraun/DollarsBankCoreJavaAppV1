package com.dollarsbank.utility;

import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

import com.dollarsbank.model.Account;
import com.dollarsbank.model.Customer;


public class ConsolePrinterUtility {

	
	private static final String MENU_STRING = "+-----------------------------+";
	private static final String SIDE_MENU_STRING = "| ";
	private static final String SIDE_MENU_STRING_END_STRING = " |";
	
	
	public static int welcomeToBank(Scanner input) {
		int choice = 0;
		while(choice != 1 && choice != 2 && choice != 3) {
		menuBlock("DOLLARSBANK Welcomes You!");
		System.out.println("1. Create New Account");
		System.out.println("2. Login");
		System.out.println("3. Exit.");
		
		System.out.println("\nEnter Choice (1,2 or 3)  :");
		
		String inputChoice = input.nextLine();
		
		try {
			choice = Integer.parseInt(inputChoice);
			if(choice != 1 && choice != 2 && choice != 3) {
				System.out.println("The value you entered is not "
						+ "a valid response!");
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid Input!!!");
		}
		
	}
		return choice;
		
}
	
	public static Account newAccount(Scanner input ) {
				menuBlock("Enter Details For New Account");
		
		System.out.println("Customer Name: ");
		String nameString = input.nextLine();
		
		System.out.println("Customer Address: ");
		String addressString = input.nextLine();
		
		System.out.println("Customer Contact Info: ");
		String contactString = input.nextLine();
		
		//TODO add logic to check for proper number
		
		System.out.println("User Id: ");
		String userId = input.nextLine();
		
		System.out.println("Password: ");
		String password = input.nextLine();
		
		System.out.println("Initial Deposit Amount");
		Double initialDeposit = input.nextDouble();
		
		//TODO check for deposit amount 
		
		return new Account(nameString, addressString, contactString, userId, password,
				initialDeposit);
		
		
	}


	public static Customer Login(Scanner input) {
		
				menuBlock("Enter Login Details");
			
		
		System.out.println("User Id : ");
		
		String userId = input.nextLine();
		
		System.out.println("Password : 8 Characters with Lower, Upper & Social");
		
		String password = input.nextLine();
		
		return new Customer(userId, password);
		
		
		
		
	}
	
	public static int welcomeCustomer(Scanner input) {
		menuBlock("WELCOME Customer!!!");
		
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Funds Transfer");
		System.out.println("4. View 5 Recent Transactions");
		System.out.println("5. Display Customer Information");
		System.out.println("6. Sign Out");
		
		System.out.println("\nEnter Choice (1,2,3,4,5 or 6)  :");
		
		int choice = input.nextInt();
		return choice;
		
	}
	
	public static void depositAmount(Scanner input, Account userAccount) {
		menuBlock("DEPOSIT");
		String inputString = "";
		boolean first = true;
		
		
		do{
			if(first) {
			System.out.println("Would you like to deposit money?");
			}else {
				System.out.println("Would you like to deposit more money?");
			}
			
			System.out.println("Y/N");
			
			inputString = input.nextLine().toLowerCase().substring(0, 1);
			
			if(inputString.equals("y")) {
				System.out.println("Please enter the amount you would like to deposit.");
				double amountDeposit = input.nextDouble();
				userAccount.setDepositedAmount(userAccount.getDepositedAmount() +amountDeposit);
				first = false;
				
			}
			
		}while(inputString.equals("y"));
		
		
	}
	
	public static void withdrawAmount(Scanner input, Account userAccount) {
		menuBlock("WITHDRAW");
		String inputString = "";
		boolean first = true;
		boolean failedAttempt = false;
		
		
		do{
			if(first) {
			System.out.println("Would you like to withdraw money?");
			}else if(failedAttempt) {
				System.out.println("Would you like to try to withdraw money again?");
			}
			
			else {
				System.out.println("Would you like to withdraw more money?");
			}
			
			System.out.println("Y/N");
			
			inputString = input.nextLine().toLowerCase().substring(0, 1);
			
			if(inputString.equals("y")) {
				System.out.println("Please enter the amount you would like to withdraw.");
				double amountWithdrawn = input.nextDouble();
				
				if(amountWithdrawn >= userAccount.getDepositedAmount()) {
				userAccount.setDepositedAmount(userAccount.getDepositedAmount() - amountWithdrawn);
				first = false;
				failedAttempt = false;
				}else {
					failedAttempt = true;
					System.out.println("The value you entered is not available to withdraw!");
				}
			}
			
		}while(inputString.equals("y"));
	}
	
	//TODO add a system memory to obtain account receiver
	public static void fundsTransfer(Scanner input, Account sender, Account receiver) {
		boolean first = true;
		String inputString = ""; 
		
		menuBlock("Funds Transfer");
		
		
		
		do {
			
			if(first) {
				System.out.println("Would you like to transfer funds to an account?");
			}else {
		System.out.println("Would you like to transfer funds to a different account?");
			}
		System.out.println("Y/N");
		
		inputString = input.nextLine().toLowerCase().substring(0, 1);
		
		
		if(inputString.equals("y")) {
		System.out.println("Please enter user id of account you would like to transfer to.");
		
		String receiverId = input.nextLine();
		
		
		if(receiver.getUserId().equals(receiverId)) {
			
			System.out.println("Please enter the amount you would like to transfer.");
			
			double amountTransfer = input.nextDouble();
			
			if(amountTransfer >= sender.getDepositedAmount()) {
			sender.setDepositedAmount(sender.getDepositedAmount() - amountTransfer);
			receiver.setDepositedAmount(receiver.getDepositedAmount()+amountTransfer);
			first = false;
			
			}else {
				System.out.println("The value you entered is not available to withdraw!");
			}
		}
		}
		
		
		
		}while(inputString.equals("y"));
		
	}
	
	
	
	public static void recentTransactions(Account account) {
		
		for(String transaction : account.getTranscationHistory()) {
			System.out.println(transaction);
		}
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println(account.getTranscationHistory()
					.get(account.getTranscationHistory().size() - (1 + i)));
		}
		
	}
	
	public static void displayCustomerInformation(Account account) {
		
		menuBlock("Customer Info");
		System.out.println("Customer Name: " + account.getFullName());
		System.out.println("Customer Address: " + account.getAddress());
		System.out.println("Customer Contact Number: " + account.getContactNumber());
		System.out.println("User Id: " + account.getUserId());
		System.out.println("Password: " + account.getPassword());
		System.out.println("Current Deposit: " + account.getDepositedAmount());
	}
	
	
	//TODO create printf for proper sizing
	public static void menuBlock(String title) {
		System.out.println(MENU_STRING);
		System.out.println(SIDE_MENU_STRING +
				title
				+ SIDE_MENU_STRING_END_STRING);
		System.out.println(MENU_STRING);
	}



}
