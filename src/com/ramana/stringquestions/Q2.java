// i/p ram#123 o/p 123#ram
package com.ramana.stringquestions;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String ");
		String s = sc.nextLine();
		//char[] a = s.toCharArray();
		int len = s.length();
//		char c[] = new char[3];
//		char num[] = new char[3];
//	 	char[] special = new char[1];
		String temp = "";
		String chara = "";
		String num = "";
		String special = "";
		
		//int ch=0,spe= 0,n = 0;
		for(int i=0;i<len;i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				chara+=s.charAt(i);
//				c[ch] = s.charAt(i);
//				ch++;
			} else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				num+=s.charAt(i);
//				num[n] = s.charAt(i);
//				n++;
			} else {
				special+=s.charAt(i);
//				special[spe] = s.charAt(i);
//				spe++;
			}
		}
		temp = num+special+chara;
		
		System.out.println(temp);
		//String srt = new String(num);
//		System.out.print(num);
//		System.out.print(special);
//		System.out.print(c);
		//System.out.print(num+""+special+""+c);
	}
}
