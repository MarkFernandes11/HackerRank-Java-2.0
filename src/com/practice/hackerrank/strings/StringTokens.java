package com.practice.hackerrank.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringTokens {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        // If isBlank() is not allowed then isEmpty() can be used of String class
        List<String> tokens = Arrays.stream(s.split("(\\s+|\'|\\?|\\!|\\||,|@|_|\\.)"))
        							.filter(str -> !str.isBlank())
        							.toList();
        
        System.out.println(tokens.size());
        
        for (String token : tokens) {
			System.out.println(token);
		}
        
        scan.close();
    }

}
