package com.practice.hackerrank.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTryCatch {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			System.out.println(a/b);
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		scanner.close();
	}

}
