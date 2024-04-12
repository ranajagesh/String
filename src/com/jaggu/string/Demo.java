package com.jaggu.string;

public class Demo {

	public static void main(String[] args) {

//		String s = "jageshwar rana";
//		String sb = "jageshwar";
//		String s1 = s.toLowerCase();
//		String s2 = sb.toUpperCase();
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
//		String s1 = s.substring(4);
//		String s2 = s.substring(2, 12);
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
//		String s = new String("abcd");
//		System.out.println(s);
//		String s1 ="abcd";
//		System.out.println(s1);
//		System.out.println(s==s1);
//		System.out.println(s.equals(s1));
		
//		String s1 = "Java Developer";
//		System.out.println(s1.length());
//		System.out.println(s1.charAt(0));
//		//System.out.println(s1.charAt(-1));
//		System.out.println(s1.length()-1);
		
//		String s1 = "Java Developer";
//		for(int i=0;i<=s1.length()-1;i++) {
//			char c = s1.charAt(i);
//			char[] c1 = s1.toCharArray();
//			//System.out.println(c);
//			//System.out.println("================");
//			System.out.println(c);
//		}
		
		String s1 = "java developer";
		char[]a = s1.toCharArray();
		for(int c:a) {
			System.out.println((byte)c);
		}
		
	}



}
