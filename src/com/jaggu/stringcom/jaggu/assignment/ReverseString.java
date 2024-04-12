package com.jaggu.stringcom.jaggu.assignment;

public class ReverseString {

	public static void main(String[] args) {
		String str = "HeleloWorld";
		System.out.println(reverse(str));
		
		
	}
	public static String reverse(String s) {
		if(s.length()==1) return s;
		int len = s.length();
		return s.charAt(len-1)+reverse(s.substring(0,len-1));
	}

}
