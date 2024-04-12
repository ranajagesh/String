package com.jaggu.stringcom.jaggu.assignment;

public class MissingVowels {

	public static void main(String[] args) {
		String s = "chandan";
		
		
		char[] c = {'a','e','i','o','u'}; 
		for(char ch:c) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				if(s.indexOf(ch)==-1) {
					System.out.print(ch+" ");
				}
			}
		}
	}

}
