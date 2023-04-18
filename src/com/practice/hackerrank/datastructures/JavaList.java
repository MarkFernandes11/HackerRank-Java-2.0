package com.practice.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaList {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
								   .map(str -> Integer.parseInt(str)).collect(Collectors.toList()));
		
		int queries = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < queries; i++) {
			String type = scanner.nextLine();
			String input = scanner.nextLine();
			
			if(type.equals("Insert")) {
				String[] values = input.split(" ");
				list.add(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
			} else {
				int deleted = list.remove(Integer.parseInt(input));
			}
			
		}
		
		for(int num : list) {
			System.out.print(num + " ");
		}
		
		scanner.close();
	}

}
