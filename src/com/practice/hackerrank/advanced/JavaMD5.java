package com.practice.hackerrank.advanced;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String hash = generateMD5Hash(input);

		System.out.println(hash);	
		
		scanner.close();
	}
	
	public static String generateMD5Hash(String input) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] bytes = messageDigest.digest(input.getBytes());
			
			BigInteger bigNum = new BigInteger(1, bytes);
			
			String hash = bigNum.toString(16);
			
			while(hash.length() < 32) {
				hash = "0" + hash;
			}
			
			return hash;
			
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

}
