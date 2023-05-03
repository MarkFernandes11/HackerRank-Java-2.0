package com.practice.hackerrank.strings;

import java.util.Scanner;

public class StringReverse {
	
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        
        isPalindrome(a);
        
        scanner.close();
        
    }

	private static void isPalindrome(String a) {
		String result = "Yes";
		
		// Trying to compare the strings till the middle character
		int limit = (a.length() % 2 == 0) ? a.length()/2 : (a.length()/2) + 1;  
		
		for (int i = 0; i < limit; i++) {
			if(a.charAt(i) != a.charAt(a.length() - 1 -i)) {
				result = "No";
			}
		}
		
		System.out.println(result);
	}

}
