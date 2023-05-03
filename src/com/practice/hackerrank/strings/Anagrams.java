package com.practice.hackerrank.strings;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

	static boolean isAnagram(String a, String b) {
		//On HackerRank if import statement not allowed then do a inline import like java.util.HashMap
		HashMap<Character, Integer> characterMap = new HashMap<>();
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			int count = characterMap.containsKey(ch) ? characterMap.get(ch) + 1 : 1;
				
			characterMap.put(ch, count);	
		}
		
		for (int i = 0; i < b.length(); i++) {
			char ch = b.charAt(i);
			
			if(characterMap.containsKey(ch)) {
				int count = characterMap.get(ch);
				if(count == 1) 
					characterMap.remove(ch);
				else 
					characterMap.put(ch, count-1);
			} else {
				characterMap.put(ch, 1);
			}
		}
		
		return characterMap.isEmpty();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
