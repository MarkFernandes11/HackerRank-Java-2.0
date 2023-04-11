package com.practice.hackerrank.introduction;

import java.util.Scanner;

public class JavaLoops2 {
	
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
         
            printSequence(a, b, n);
        }
        
        in.close();
    }

	private static void printSequence(int a, int b, int n) {
		StringBuilder sequence = new StringBuilder();
		int prev = a + ((int) Math.pow(2, 0)) * b;
		sequence.append(prev + " ");
		
		for (int i = 1; i < n; i++) {
			prev += ((int) Math.pow(2, i)) * b;
			
			sequence.append(prev + " ");
		}
		
		System.out.println(sequence);
	}

}
