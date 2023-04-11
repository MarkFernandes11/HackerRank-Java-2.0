package com.practice.hackerrank.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.GregorianCalendar;

class Result {

    public static String findDay(int month, int day, int year) {
    	String[] daysArrays = new String[]{"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};    	
		Date date = new GregorianCalendar(year, month-1, day).getTime();
    	
    	return daysArrays[date.getDay()];
    }

}

public class JavaDateAndTime {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month - 1, day, year);
		System.out.println(res);

		bufferedReader.close();
	}

}
