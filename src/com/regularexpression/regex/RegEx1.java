package com.regularexpression.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abcdabxyab");
		
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("---------------");
		}
	}

}
