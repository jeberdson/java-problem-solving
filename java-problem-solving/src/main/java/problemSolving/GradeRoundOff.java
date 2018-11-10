package main.java.problemSolving;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GradeRoundOff {
	/*
	 * Complete the gradingStudents function below.
	 */
	static int[] gradingStudents(int[] grades) {

		int[] roundOffValues = new int[grades.length];

		int count = 0;

		for (int n : grades) {
			int remainder = n % 5;
			int quotient = n / 5;

			int roundOffValue;

			if (remainder < 3 || n < 37) {
				roundOffValue = n;
			} else {
				roundOffValue = (quotient + 1) * 5;
			}
			roundOffValues[count] = roundOffValue;
			count++;
		}

		return roundOffValues;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bw = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());
		int remainder = n % 5;
		int quotient = n / 5;

		if (n < 38) {
			return;
		}

		if (remainder < 3) {
			System.out.println(n);
		} else {
			int roundOffValue = (quotient + 1) * 5;
			System.out.println(roundOffValue);
		}

		int[] grades = new int[n];

		Object aa = grades.length;

		// grades.
		//
		// for (int gradesItr = 0; gradesItr < n; gradesItr++) {
		// int gradesItem = Integer.parseInt(scan.nextLine().trim());
		// grades[gradesItr] = gradesItem;
		// }
		//
		// int[] result = gradingStudents(grades);

		// for (int resultItr = 0; resultItr < result.length; resultItr++) {
		// bw.write(String.valueOf(result[resultItr]));
		//
		// if (resultItr != result.length - 1) {
		// bw.write("\n");
		// }
		// }
		//
		// bw.newLine();
		//
		// bw.close();
	}
}
