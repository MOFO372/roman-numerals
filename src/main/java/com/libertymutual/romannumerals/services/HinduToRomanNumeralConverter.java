package com.libertymutual.romannumerals.services;

public class HinduToRomanNumeralConverter {

	private String romanNumerals = "";
	
	public HinduToRomanNumeralConverter() {
		
//		romanNumerals[0] = "I"; 
//		romanNumerals[4] = "V"; 
//		romanNumerals[9] = "X"; 
//		romanNumerals[49] = "L"; 
//		romanNumerals[99] = "C"; 
//		romanNumerals[499] = "D"; 
//		romanNumerals[999] = "M"; 
		
	}

	public String convert(int input) {
//		String romanNumeral = "";
//
//		if (input == 1) {
//			return "I";
//
//		} else if (input == 2) {
//			return "II";
//
//		} else if (input == 3) {
//			return "III";
//
//		} else if (input == 4) {
//			return "IV";
//
//		}
	
		
//		if(input == 40) {
//			romanNumerals += "XL";
//			input = 0; 
//		}
		
		while(input >= 100) {
			romanNumerals += "C"; 
			input = input -100;
		}
		
		while(input >= 90) {
			romanNumerals += "XC";
			input = input - 90; 
		}
		
		while(input >= 50) {
			romanNumerals += "L";
			input = input - 50; 
		}
		
		while(input > 39) {
			romanNumerals += "XL"; 
			input = input - 40;
		}
		
		while(input > 9) {
			romanNumerals += "X"; 
			input = input - 10; 
		}
		
		if(input == 4) {
			romanNumerals += "IV";
			input = 0; 
		}
		
		if(input == 9) {
			romanNumerals += "IX";
			input = 0; 
		}
		
		if(input > 4) {
			romanNumerals += "V";
			input = input - 5; 
		}
		
		if(input < 4 && input > 0) {
			for(int i = 0; i < input; i+= 1) {
				romanNumerals += "I"; 
			}
		}
		
		String result = romanNumerals; 
		return result; 
	}

}
