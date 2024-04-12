package com.jaggu.stringcom.jaggu.assignment;

import java.util.Scanner;

public class EncodedString {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Any String that you want to decode");
	String s = sc.nextLine();
	System.out.println("Enter level of decoding ");
	int level = sc.nextInt();
	String s2 = "";
	char[]a = s.toCharArray();
	char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	level = level%26;
		for(char c:a) {
			int index = c-'a';
			index+=level;
			index = index%26;
			s2+=alpha[index];
			
		}
			System.out.println(s2);	
	}
}
