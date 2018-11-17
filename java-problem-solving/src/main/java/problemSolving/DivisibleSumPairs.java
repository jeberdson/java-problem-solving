package main.java.problemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DivisibleSumPairs {

	// Complete the divisibleSumPairs function below.

	// 6 3
	// 1 3 2 6 1 2
	static int divisibleSumPairs(int n, int k, int[] ar) {
		
		int iteration = 0;
		int divisibleSumPairs = 0;
		for (int a : ar) {
			for (int i = 0; i < n; i++) {
				if(iteration != i){
					int sum = a + ar[i];
					if (sum % k == 0) {
						divisibleSumPairs++;
					}
				}
			}
			iteration++;
		}
		return divisibleSumPairs / 2;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = divisibleSumPairs(n, k, ar);

		scanner.close();
	}
}