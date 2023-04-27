package com.practice.hackerrank.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(isValidString(input));
		}
		
		sc.close();
	}
	
	private static boolean isValidString(String input) {
		boolean result = true;
		
		if(input.length() % 2 == 1) return false;
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(') {
				stack.push(input.charAt(i));
			} else if(input.charAt(i) == '}' || input.charAt(i) == ']' || input.charAt(i) == ')') {
				char closingBracket = input.charAt(i);
				
				if(stack.isEmpty()) {
					result = false;
					break;
				}
				
				char lastBracket = stack.pop();
				
				result = isValidBracket(closingBracket, lastBracket);
				
				if(!result) break;
			}
		}
		
		return result && stack.isEmpty();
	}

	private static boolean isValidBracket(char closingBracket, char lastBracket) {
		boolean result = true;
		
		switch (closingBracket) {
		case '}':
			if(lastBracket != '{') result = false;
			
			break;
			
		case ']':
			if(lastBracket != '[') result = false;
			
			break;
			
		case ')':
			if(lastBracket != '(') result = false;
			
			break;					

		default:
			break;
		}
		
		return result;
	}
}
