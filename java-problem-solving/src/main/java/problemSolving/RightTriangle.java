package main.java.problemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RightTriangle {
	
	public static void main(String[] args) {
		
		int triangleHeight = 100;
		System.out.println(drawTriangle(triangleHeight));
    }

	private static String drawTriangle(int triangleHeight) {
		
		StringBuilder sb = new StringBuilder();
		
		StringBuffer resultString = new StringBuffer();
		
		for(int x = 0; x < triangleHeight; x++){
			sb.append("*");
		}
		String firstLine = sb.toString();
		
		resultString.append(firstLine);
		
		for(int x = triangleHeight - 1; x > 0; x--){
			String newString = firstLine.substring(0, x);
			resultString.append("\n"+newString);
		}
		
		return resultString.toString();
	}
}