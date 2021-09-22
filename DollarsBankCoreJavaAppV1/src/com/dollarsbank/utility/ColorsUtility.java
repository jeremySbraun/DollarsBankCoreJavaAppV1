package com.dollarsbank.utility;

public class ColorsUtility {

	
	 
	 private final static String RED_COLOR = "\033[31m" ;
	 private final static String BLUE_COLOR = "\033[34m";
	 private final static String GREEN_COLOR = "\033[32m";
	 private final static String YELLOW_COLOR = "\033[33m";
	 private final static String ENDING_SEQUENCE = "\0";
	 
	 
	 private enum COLOR_SEQUENCE{
		 RED, BLUE, GREEN, YELLOW
	 }
	 
	 
	 public static String applyColor(String sequence, String colorRequested) {
		
		 
		 COLOR_SEQUENCE color = COLOR_SEQUENCE.valueOf(colorRequested);
		 
		 String coloString= "";
		 
		 
		 switch(color) {
		 case RED: coloString = RED_COLOR + sequence;
			 break;
			 
		 case BLUE: coloString = BLUE_COLOR + sequence;
			 break;
		 case GREEN: coloString = GREEN_COLOR + sequence;
			 break;
		 case YELLOW: coloString = YELLOW_COLOR + sequence;
			 break;
			 
		 default:
			 return sequence;
		 }
		 
		 coloString = coloString + ENDING_SEQUENCE;
		
		 return coloString;
		 
	 }
	 
	 
}
