package com.java.stringPractice;

public class String11VowelCharacter {

	public static void main(String[] args) {
		String s = "jaggu dada";
		char [] a = s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			char c = s.charAt(i);
			
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println(c);
			}
		}
	}

}
