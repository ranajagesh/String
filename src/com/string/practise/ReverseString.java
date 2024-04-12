package com.string.practise;

public class ReverseString {

	public static void main(String[] args) {
//		String s  ="banana";
//		char[] c = s.toCharArray();
//		int i=0,j=c.length-1;
//		while(i<j) {
//			char a = c[i];
//			c[i] = c[j];
//			c[j] = a;
//			i++;
//			j--;
//		}
//		System.out.println(new String(c));
		
		String s = "banana";
		StringBuilder s1 = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			s1.append(s.charAt(i));
		}
		System.out.println(s1);
	}

}
