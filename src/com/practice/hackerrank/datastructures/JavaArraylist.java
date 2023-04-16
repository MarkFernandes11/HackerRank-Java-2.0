package com.practice.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		List<List<Integer>> list = new ArrayList<>();
		
		// List creation
		for(int i = 0; i < n; i++) {
			List<Integer> tempList = Arrays.stream(
					scanner.nextLine()
					.replaceAll("\\s+$", "").split(" "))
					.mapToInt(Integer::parseInt).boxed().toList();
			
			list.add(tempList);
		}
		
		// Queries
		int q = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < q; i++) {
			String s = scanner.nextLine();
			int[] arr = Arrays.stream(s.split(" ")).mapToInt(str -> Integer.parseInt(str)).toArray();
			
			if(arr[0] <= list.size()) {
				List<Integer> tempList = list.get(arr[0]-1);
				
				if(arr[1] < tempList.size()) {
					System.out.println(tempList.get(arr[1]));
				} else {
					System.out.println("ERROR!");
				}
			} else {
				System.out.println("ERROR!");
			}

		}
		
		scanner.close();
	}
	
}
