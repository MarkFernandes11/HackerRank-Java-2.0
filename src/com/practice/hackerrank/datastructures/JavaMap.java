package com.practice.hackerrank.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> phoneBook = new HashMap<>();
		
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			
			phoneBook.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			
			System.out.println(phoneBook.containsKey(s) ? (s+"="+phoneBook.get(s)) : "Not found");
		}
		
		in.close();
	}

}
