package com.jaggu.string;
// Using StringBuilder
public class ReverseString {

	public static void main(String[] args) {
		/*
		String s = "arraY";
		StringBuilder s1 = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			s1.append(s.charAt(i));
		}
		System.out.println(s1);
		
		*/
		
		String s = "jaggU";
		char[] c = s.toCharArray();
		int i=0,j=c.length-1;
		while(i<j) {
			char t = c[i];
			c[i] = c[j];
			c[j] = t;
			i++;
			j--;
		}
		String s1 = new String(c);
		System.out.println(s1);
	}

}
