package com.java.stringPractice;

public class StringQ16TitleCase {

	public static void main(String[] args) {
		String s = "Java is a very easy language";
		s = s.toLowerCase();
		String[] s1 = s.split(" ");
		String s2 = "";
		for(int i=0;i<s1.length;i++) {
			s2+=titleCase(s1[i]+" ");
		}
		System.out.println(s2);
	}
	
	public static String titleCase(String s) {
		char []a = s.toCharArray();
		String s1 = "";
		
		for(int i=0;i<a.length;i++) {
			char c = a[i];
			if(c==a[0]) {
				if(c>='a' && c<='z') {
					c = (char) (c-32);					
				}
			}
			s1+=c;			
		}
		return s1;
	}

}
