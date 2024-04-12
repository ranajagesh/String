package com.java.stringPractice;

public class Reverse {

	public static void main(String[] args) {
		String s = "jaggu";
		char[]c = s.toCharArray();
		
		int i = 0;
		int j = c.length-1;
		
		while(i<j) {
			char a = c[i];
			c[i] = c[j];
			c[j] = a;
			i++;
			j--;
			
		}
		System.out.println(c);
	}

}
