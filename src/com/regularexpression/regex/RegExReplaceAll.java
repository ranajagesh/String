package com.regularexpression.regex;

public class RegExReplaceAll {

	public static void main(String[] args) {
		String s  = "a1b2c";
		System.out.println(s.replace("[0-9]", "_"));
		System.out.println(s.replaceAll("[0-9]", "_"));
		System.out.println(s.replaceAll("[0-9]", ""));
	}

}
