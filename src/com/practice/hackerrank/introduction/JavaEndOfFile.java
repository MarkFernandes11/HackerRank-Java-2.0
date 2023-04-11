package com.practice.hackerrank.introduction;

import java.util.Scanner;

public class JavaEndOfFile {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		while(scanner.hasNext()) {
			String string = scanner.nextLine();
			count++;
			
			System.out.println(count + " " + string);
		}
		
		scanner.close();
	}

}
