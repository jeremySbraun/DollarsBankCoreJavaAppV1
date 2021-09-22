package com.dollarsbank.utility;

import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

import com.dollarsbank.model.Account;
import com.dollarsbank.model.Customer;


public class ConsolePrinterUtility {

	
	private static final String MENU_STRING = "+-----------------------------+";
	private static final String SIDE_MENU_STRING = "| ";
	private static final String SIDE_MENU_STRING_END_STRING = " |";
	
	
	public static void welcomeToBank() {
		System.out.println(MENU_STRING);
		System.out.println(SIDE_MENU_STRING 
				+ "DOLLARSBANK Welcomes You!" + SIDE_MENU_STRING_END_STRING);
		System.out.println("1. Create New Account");
		System.out.println("2. Login");
		System.out.println("3. Exit.");
	}
	
	public static Account newAccount(Scanner input ) {
		System.out.println(MENU_STRING);
		System.out.println(SIDE_MENU_STRING +
				"Enter Details For New Account"
				+ SIDE_MENU_STRING_END_STRING);
		
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
		System.out.println(MENU_STRING);
		System.out.println(SIDE_MENU_STRING +
				"Enter Login Details"
				+ SIDE_MENU_STRING_END_STRING);
		
		System.out.println("User Id : ");
		
		String userId = input.nextLine();
		
		System.out.println("Password : ");
		
		String password = input.nextLine();
		
		return new Customer(userId, password);
		
		
		
		
	}



}
