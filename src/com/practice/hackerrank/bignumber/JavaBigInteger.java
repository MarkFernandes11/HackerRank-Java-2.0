package com.practice.hackerrank.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	
	public static final Scanner SCANNER = new Scanner(System.in); 

	public static void main(String[] args) {
		
		BigInteger a = new BigInteger(SCANNER.next());
		BigInteger b = new BigInteger(SCANNER.next());
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		
		SCANNER.close();
	}
	
}
