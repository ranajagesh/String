package com.jaggu.string;

public class Replace {

	public static void main(String[] args) {
		String s = "developer";
		String s1 = "malayalam";
		System.out.println(s.replace('e','@'));
		System.out.println(s.replace("elo","ELO"));
		System.out.println(s.replace("e", ""));
		
		int c = s1.length()-s1.replace("a", "").length();
		System.out.println(c);
	}

}
