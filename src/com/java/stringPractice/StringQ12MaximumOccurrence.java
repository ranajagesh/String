package com.java.stringPractice;

public class StringQ12MaximumOccurrence {
	public static void main(String[] args) {
		String s = "ramana";
		char []a = s.toCharArray();
		char chr  = ' ';
		int max = 0;
		
		for(int i=0;i<a.length;i++) {
			char c = a[i];
			int count = 1;
			for(int j=i+1;j<a.length;j++) {
				if(c==a[j]) {
					count++;
				}				
			}
			if(count>max) {
				max =count;
				chr = c;
			}
		}
		System.out.print(chr+"="+max);
	}
}
