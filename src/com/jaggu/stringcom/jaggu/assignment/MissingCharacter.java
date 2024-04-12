package com.jaggu.stringcom.jaggu.assignment;

import com.jaggu.string.IndexOf;

public class MissingCharacter {

	public static void main(String[] args) {
		String s = "abchdf";
		
		for(char ch ='a';ch<='z';ch++) {
			if(s.indexOf(ch)==-1) {
				System.out.print(ch+" ");
			}
		}
	}

}
