package main.java.problemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayCandles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
		Arrays.sort(ar);
		int largestDuplicates = 1;
		
		for(int i = ar.length -1; i > 0;i--){
			
			if(ar[i] == ar[i - 1]){
				largestDuplicates++;
				continue;
			}else{
				break;
			}
			
		}
		
		System.out.println(largestDuplicates);
		
	        
		return largestDuplicates;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }}