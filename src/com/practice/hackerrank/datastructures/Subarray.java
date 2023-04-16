package com.practice.hackerrank.datastructures;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		List<Integer> list = Arrays.stream(
							scanner.nextLine()
							.replaceAll("\\s+$", "").split(" "))
							.mapToInt(Integer::parseInt).boxed().toList();
		
		System.out.println(negativeSubArrayCount(list));
		
		scanner.close();
	}

	private static int negativeSubArrayCount(List<Integer> list) {
		int count = 0;
		int subListSize = 1;
		
		while(subListSize <= list.size()) {
			
			for (int i = 0; i < list.size(); i++) {
				if(i + subListSize <= list.size()) {
					int sum = list.subList(i, i+subListSize).stream().mapToInt(num -> num).sum();
					
					if(sum < 0) count++;
				} else {
					break;
				}
			}
			
			subListSize++;
		}
		
		return count;
	}
	
}
