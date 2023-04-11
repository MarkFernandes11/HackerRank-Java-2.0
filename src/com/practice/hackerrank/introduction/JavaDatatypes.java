package com.practice.hackerrank.introduction;

import java.util.Scanner;

public class JavaDatatypes {

	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");

				// For byte type
				if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
					System.out.println("* byte");
				
				// For short type
				if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
					System.out.println("* short");
				
				// For int type
				if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
					System.out.println("* int");
				
				// For long type
				if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
					System.out.println("* long");
				
				
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
		
		sc.close();
	}

}
