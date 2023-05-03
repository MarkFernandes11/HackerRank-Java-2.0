package com.practice.hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testcases = Integer.parseInt(scanner.nextLine());
		
		// (.+) One or more of any characters and captures it in the first group. This is used to match the tag name.
		// </(\\1)> Using the first group to create the end tag
		// ([^<>]+) Matches one or more of any character except an opening or closing angle bracket, 
		// and captures it in the second group. This is used to match the non-tag content between the opening and closing tags.
		Pattern pattern = Pattern.compile("<(.+)>([^<>]+)</(\\1)>");
		
		while(testcases > 0) {
			String line = scanner.nextLine();
			Matcher matcher = pattern.matcher(line);
			
			boolean invalidTag = true;
			while(matcher.find()) {
				System.out.println(matcher.group(2));
				invalidTag = false;
			}
			
			if(invalidTag) System.out.println("None");
			
			testcases--;
		}
		
		scanner.close();
	}

}
