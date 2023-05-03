package com.practice.hackerrank.strings;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}

		in.close();
	}

}

class MyRegex {

	// ([01]?\\d{1,2}|2[0-4]\\d|25[0-5])
	// [01]?\\d{1,2} - for range of 0-199 including leading 0's
	// 2[0-4]\\d - for range of 200-249
	// 25[0-5] - for range of 250-255
	public final String pattern = "^([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])$";
	
}
