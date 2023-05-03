package com.practice.hackerrank.strings;

import java.util.Scanner;

public class SubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		for (int i = 0; i <= s.length() - k; i++) {
			String subString = s.substring(i, i+k);
			
			smallest = smallest.isEmpty() ? subString : smallest;
			largest = largest.isEmpty() ? subString : largest;
			
			System.out.println(subString + " ("+i+", "+(i+k)+")");
			
			if(subString.compareTo(smallest) < 0) smallest = subString;
			
			if(subString.compareTo(largest) > 0) largest = subString;
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

}
