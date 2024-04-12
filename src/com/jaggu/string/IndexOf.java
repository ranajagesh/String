package com.jaggu.string;

public class IndexOf {

	public static void main(String[] args) {
		String s = "java developer";
		
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('v',3));
		System.out.println(s.indexOf("j",2));
		
		System.out.println(s.contains("lop"));
		System.out.println(s.startsWith("j"));
		System.out.println(s.endsWith("q"));
	}

}
