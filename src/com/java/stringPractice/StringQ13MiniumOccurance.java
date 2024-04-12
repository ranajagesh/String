package com.java.stringPractice;

public class StringQ13MiniumOccurance {

	public static void main(String[] args) {
		String s = "ramannrnrnnra";
		char a[]  = s.toCharArray();
		int min = 0;
		char chr = ' ';
		int count = 1;
		for(int i=0;i<a.length;i++) {
			char c = a[i];
			for(int j= i+1;j<a.length;j++) {
				count = s.length() - s.replace(c+"", "").length();
				if(count>min) {
					count++;
					min = count;
					chr = c;
				}
			}
		}
		System.out.println(chr + "="+ count);
	}

}
