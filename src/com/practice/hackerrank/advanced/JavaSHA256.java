package com.practice.hackerrank.advanced;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String hash = generateSHA256Hash(input);
		System.out.println(hash);
		
		scanner.close();
	}

	private static String generateSHA256Hash(String input) {
		
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			byte[] bytes = messageDigest.digest(input.getBytes(StandardCharsets.UTF_8));
			
			BigInteger bigNum = new BigInteger(1, bytes);
			StringBuilder hash = new StringBuilder(bigNum.toString(16));
			
			while(hash.length() < 64) {
				hash.insert(0, '0');
			}
			
			return hash.toString();
			
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}

	}

}
