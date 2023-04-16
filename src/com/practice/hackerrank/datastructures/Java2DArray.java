package com.practice.hackerrank.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java2DArray {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        System.out.println(maxHourGlassSum(arr));

        bufferedReader.close();
    }
    
    private static int maxHourGlassSum(List<List<Integer>> arr) {
    	int max = Integer.MIN_VALUE;
    	
    	for (int i = 0; i < arr.size()-2; i++) {
        	for (int j = 0; j < arr.get(0).size()-2; j++) {
    			int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + arr.get(i+1).get(j+1)
    					+ arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
    			
    			max = Math.max(max, sum);
    		}
		}
    	
    	return max;
    }

}
