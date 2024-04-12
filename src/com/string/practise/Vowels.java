package com.string.practise;

public class Vowels {

	public static void main(String[] args) {
		String s = "abcdefg";
//		char s1 = ' ';
		char[] c = s.toCharArray();
		
		for(int i=0;i<s.length()-1;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
//				s1 = c[i];
				System.out.print(c[i]);
			}
		}
		
	}

}
