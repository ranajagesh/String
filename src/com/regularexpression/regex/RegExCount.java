package com.regularexpression.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExCount {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher("su1 c23 ce4 ss");
		
		int sum = 0;
		while(m.find()) {
			sum+=Integer.parseInt(m.group());
		}
		System.out.println(sum);
	}

}
