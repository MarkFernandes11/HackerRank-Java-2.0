package com.practice.hackerrank.advanced;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeChecker {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			Prime ob=new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
}

class Prime {
	
	public void checkPrime(int... nums) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < nums.length; i++) {
			BigInteger num = new BigInteger(String.valueOf(nums[i]));
			
			if(num.isProbablePrime(1)) builder.append(num + " ");
		}
		
		System.out.println(builder);
	}
	
}
