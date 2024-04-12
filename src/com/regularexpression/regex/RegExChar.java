package com.regularexpression.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExChar {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("([a-z])\\1*");
		Matcher m = p.matcher("aabbbccccde");
		String s = "";
		
		while(m.find()) {
			String s1 = m.group();
			s+=s1.length()+""+s1.charAt(0);
			}
		System.out.println(s);
	}

}
