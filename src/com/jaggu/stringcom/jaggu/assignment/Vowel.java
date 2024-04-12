package com.jaggu.stringcom.jaggu.assignment;

public class Vowel {
	public static void main(String[] args) {
		String s = "VowElsu";
		String s1 = "";
		
		for(int i=0;i<s.length();i++) {
			s = s.toLowerCase();
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				s1+=c;
			}
		}
		System.out.println(s1);
	}
}
