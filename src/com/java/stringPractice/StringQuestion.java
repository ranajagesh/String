package com.java.stringPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringQuestion {

	public static void main(String[] args) {
		String s = "java9 is43 a6 language27";	
		        int sum = SumNumbers(s);
		        System.out.println("Sum of numbers: " + sum);
		    }
		    private static int SumNumbers(String input) {
		        int sum = 0;
		        Pattern pattern = Pattern.compile("[0-9]+");//compile("\\d+") //( \\d+ ) is used to find all occurrences of one or more digits
		        Matcher matcher = pattern.matcher(input);

		        while (matcher.find()) {
		            sum += Integer.parseInt(matcher.group());
		        }

		        return sum;
		    }

}
