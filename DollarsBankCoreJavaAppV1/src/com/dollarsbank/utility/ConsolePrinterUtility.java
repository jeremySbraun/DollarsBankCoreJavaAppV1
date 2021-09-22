package com.dollarsbank.utility;

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
}
