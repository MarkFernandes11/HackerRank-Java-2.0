package com.practice.hackerrank.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
	static int B;
	static int H;
	static boolean flag;
	
	private static final Scanner SCANNER = new Scanner(System.in);
	
	static {
		B = SCANNER.nextInt(); 
		H = SCANNER.nextInt();
		
		if(B > 0 && H > 0) {
			flag = true;
		} else {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
	
	public static void main(String[] args) {
		
		if(flag) {
			int area=B * H;
			System.out.print(area);
		}
		
		SCANNER.close();
	}

}
