package com.java.stringPractice;

public class CountWords {

	public static void main(String[] args) {
		String s = "jaggu is a good boy";
		char[] c = s.toCharArray();
		int count  = 0;
		
		for(int i=0;i<c.length;i++) {
			if(c[i]==' ') continue;
			count++;
		}
		System.out.println(count);
	}

}
