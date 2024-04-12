package com.regularexpression.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

	public static void main(String[] args) {
//		Pattern p = Pattern.compile("ab{2}");
//		Pattern p = Pattern.compile("ab{2,4}");
//		Pattern p = Pattern.compile("ab+c");
//		Pattern p = Pattern.compile("ab*c");
//		Pattern p = Pattern.compile("ab?c");
//		Pattern p = Pattern.compile("a+[0-9]");
//		Pattern p = Pattern.compile("a[0-9]");
//		Pattern p = Pattern.compile("a+[0-9]*");
//		Pattern p = Pattern.compile("(ab)+");
//		Pattern p = Pattern.compile("[0-9]{2}");
//		Pattern p = Pattern.compile("1(a|b)3");
		Pattern p = Pattern.compile("a.*");
		Matcher m = p.matcher("abbbab1ccaa212dia3abbcca43cbaa5c");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("-----------");
		}
	}

}
