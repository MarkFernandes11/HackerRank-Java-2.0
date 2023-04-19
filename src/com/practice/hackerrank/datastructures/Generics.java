package com.practice.hackerrank.datastructures;

public class Generics {
	
	public static void main(String[] args) {
        Integer[] intArray = new Integer[] {1, 2, 3};
        String[] stringArray = new String[]{"Hello", "World"};
        
        Printer<Integer> intPrinter = new Printer<>();
        Printer<String> stringPrinter = new Printer<>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
	}

}

class Printer <T> {

	public void printArray(T[] array) {
		for(T item : array) {
			System.out.println(item);
		}
	}
	
}