package com.regularexpression.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackReferencing {

	public static void main(String[] args) {
//		Pattern p = Pattern.compile("([a-z])([a-z])\\1");
//		Pattern p = Pattern.compile("([a-z])([a-z])\\2");
//		Pattern p = Pattern.compile("([a-z])\\1+");
//		Pattern p = Pattern.compile("([a-z]+)\\1");
		Pattern p = Pattern.compile("");
		Matcher m = p.matcher("abaabbcdd");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("----------");
		}
	}

}
