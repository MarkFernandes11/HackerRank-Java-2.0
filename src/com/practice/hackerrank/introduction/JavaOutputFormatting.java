package com.practice.hackerrank.introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();

			// %s for string and %-15s for string with trailing whitespaces upto 15 characters
			// %d for decimal number and %03d for decimal number upto 3 digits with leading 0's
			// %n for next line
			System.out.printf("%-15s%03d%n", s1, x);  
		}
		System.out.println("================================");

		sc.close();
	}

}
