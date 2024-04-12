package com.ramana.stringquestions;

public class Q16InitialCapital {

	public static void main(String[] args) {
		String s = "java is very eAsy laNaguAge";
		s=s.toLowerCase();
		String []arr = s.split(" ");
		String s1 ="";
		for(int i=0;i<arr.length;i++) {
			s1+=initCap(arr[i]+" ");
		}
		System.out.println(s1);
	}
	
	public static String initCap(String s) {
		char[]a = s.toCharArray();
		String s1 = "";
		
		for(int i=0;i<a.length;i++) {
			char c = a[i];
			if(c==a[0]) {
				if(c>='a' && c<='z') {
					c= (char) (c-32);
				}
			}
			s1+=c;
		}
		return s1;
	}

}
