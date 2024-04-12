package com.regularexpression.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^ab]");
		Matcher m = p.matcher("ab2cd1a4bx3y");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("------------");
		}
		
		
	}

}
