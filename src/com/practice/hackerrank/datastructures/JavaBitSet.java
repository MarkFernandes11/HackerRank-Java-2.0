package com.practice.hackerrank.datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split("\\s+");
		
		int size = Integer.parseInt(arr[0]);
		int queries = Integer.parseInt(arr[1]);
		
		BitSet b1 = new BitSet(size);
		BitSet b2 = new BitSet(size);
		
		for (int i = 0; i < queries; i++) {
			String[] ipArray = scanner.nextLine().split("\\s+");
			performOperation(ipArray, b1, b2);
		}
		
		scanner.close();
	}
	
	private static void performOperation(String[] ipArray, BitSet b1, BitSet b2) {
		String operation = ipArray[0];
		int a = Integer.parseInt(ipArray[1]);
		int b = Integer.parseInt(ipArray[2]);
		
		switch (operation) {
		case "AND": 
			if(a == 1) b1.and(b2);
			else b2.and(b1);
			break;
			
		case "OR": 
			if(a == 1) b1.or(b2);
			else b2.or(b1);
			break;
			
		case "XOR": 
			if(a == 1) b1.xor(b2);
			else b2.xor(b1);
			break;
			
		case "FLIP": 
			if(a == 1) b1.flip(b);
			else b2.flip(b);
			break;				
			
		case "SET": 
			if(a == 1) b1.set(b);
			else b2.set(b);
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + operation);
		}
		
		System.out.println(b1.cardinality() + " " + b2.cardinality());
	}

}
