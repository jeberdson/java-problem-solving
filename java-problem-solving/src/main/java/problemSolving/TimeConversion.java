package main.java.problemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TimeConversion {   /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    	
//    	07:05:45PM
    	
    	
    	String meridian = s.substring(s.length()-2);
    	
    	if(meridian.equals("AM")){
    		
    		if(s.substring(0, 2).equals("12")){
    			
    			return "00" +s.substring(2, s.length() - 2);
    		}
    		return s.substring(0, s.length()-2);
    	}else{
    		
    		if(s.substring(0, 2).equals("12")){
    			
    			return s.substring(0, s.length() - 2);
    		}
    		
    		int aa = Integer.parseInt(s.substring(0, 2)) + 12;
    		
    		return String.valueOf(aa) + s.substring(2, s.length() - 2);
    		
    	}

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        
        System.out.println(result);

//        bw.write(result);
//        bw.newLine();
//
//        bw.close();
    }}