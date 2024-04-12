package com.jaggu.stringcom.jaggu.assignment;

public class MaxCountVowel {

	public static void main(String[] args) {
		String s = "abbbbccaiiii";
		char[] a = {'a','e','i','o','u'};
		
		int max = 0;
		//int count;
		char chr = ' ';
		
		for(char c:a) {
			
		int count = s.length() - s.replace(c+"", "").length();
		
		if(count>max) {
			max = count;
			chr = c;
		}
		
		}
//		System.out.println(s +" "+chr);
		System.out.println(chr);
	}

}
