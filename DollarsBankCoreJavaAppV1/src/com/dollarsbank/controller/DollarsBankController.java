package com.dollarsbank.controller;

import java.util.Scanner;

import com.dollarsbank.model.Account;
import com.dollarsbank.utility.ConsolePrinterUtility;
import com.dollarsbank.utility.FileStorageUtility;

public class DollarsBankController {

	
	
	public static void run() {
		Scanner userInput = new Scanner(System.in);
		boolean newUser = false;
		
		
		
		
		do {
		int choice = ConsolePrinterUtility.welcomeToBank(userInput);
		
		switch(choice) {
		case 1: 
		Account newAccount = ConsolePrinterUtility.newAccount(userInput);
		FileStorageUtility.addAccount(newAccount);
		
		System.out.println("User created!");
		newUser = true;
			break;
		
			
		case 2: ConsolePrinterUtility.Login(userInput);
			break;
			
		case 3: 
			System.out.println("Enjoy your day!");
			System.exit(0);
		
	}
		
		}while(newUser);
}
	
	
}
