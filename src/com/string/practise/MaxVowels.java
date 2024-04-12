package com.string.practise;

public class MaxVowels {

	public static void main(String[] args) {
		String s = "abcabababac";
		char[]a = {'a','e','i','o','u'};
		int max = 0;
		char c = ' ';
		
		for(char ch:a) {
			int count = s.length()-s.replace(ch+"", "").length();
			
			if(count>max) {
				max=count;
				c = ch;
				System.out.println(c);
			}		
		}
		System.out.println(c);
		
	}

}
