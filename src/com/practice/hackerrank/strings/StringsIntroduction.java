package com.practice.hackerrank.strings;

import java.util.Scanner;

public class StringsIntroduction {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.next();
		String b = scanner.next();
		
		lengthOfStrings(a, b);
		isALexicographicallyLargerThanB(a, b);
		formatStrings(a, b);
		
		scanner.close();
	}

	private static void lengthOfStrings(String a, String b) {
		System.out.println(a.length() + b.length());
	}
	
	private static void isALexicographicallyLargerThanB(String a, String b) {
		System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
	}

	private static String capitalizeFirstCharacter(String s) {
		return String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1, s.length());
	}
	
	private static void formatStrings(String a, String b) {
		System.out.println(capitalizeFirstCharacter(a) + " " + capitalizeFirstCharacter(b));		
	}
}
