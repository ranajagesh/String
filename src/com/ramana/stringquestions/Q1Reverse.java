package com.ramana.stringquestions;

public class Q1Reverse {

	public static void main(String[] args) {
		String s = "jaggu";
		char[]a = s.toCharArray();
		int i=0,j=a.length-1;
		while(i<j) {
			char c = a[i];
			a[i] = a[j];
			a[j] = c;
			i++;
			j--;
		}
		System.out.println(a);
	}

}
