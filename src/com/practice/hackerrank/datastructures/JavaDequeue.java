package com.practice.hackerrank.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaDequeue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		
		Set<Integer> set = new HashSet<>();
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();

			deque.addLast(num);
			set.add(num);
			
			if(deque.size() == m) {
				max = Math.max(max, set.size());
				
				int first = deque.removeFirst();
				
				// If deque does not contains the element with value as first then removing it from the set
				if(!deque.contains(first)) set.remove(first);
			}
		}
		
		System.out.println(max);
		
		in.close();
	}

}
