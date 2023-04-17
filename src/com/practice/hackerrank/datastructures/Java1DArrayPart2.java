package com.practice.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java1DArrayPart2 {

    public static boolean canWin(int leap, int[] game) {
        return canWin(leap, game, 0);
    }

    private static boolean canWin(int leap, int[] game, int i) {
        if (i >= game.length) {
            return true;
        } else if (i < 0 || game[i] == 1) {
            return false;
        }

        game[i] = 1;

        return canWin(leap, game, i + leap) ||
               canWin(leap, game, i + 1) ||
               canWin(leap, game, i - 1);
    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		int count = 0;
		
		List<String> result = new ArrayList<>();
		
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();
			
//			System.out.println(n + " " + leap);

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}
			
//			System.out.println(Arrays.toString(game));

			result.add(((canWin(leap, game)) ? "YES" : "NO"));
//			System.out.println(q + " " + ((canWin(leap, game)) ? "YES" : "NO"));
		}
		
		for(String str : result) {
			System.out.println(count++ + " " +  str);
		}
		
		scan.close();
	}

}
