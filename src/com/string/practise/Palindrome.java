package com.string.practise;

public class Palindrome {

	public static void main(String[] args) {
		String s = "banaannaanab";
		System.out.println(isPalin(s));
	}
	
	public static boolean isPalin(String s) {
//		s.toLowerCase();
//		char[] a = s.toCharArray();
//		int i=0,j=s.length()-1;
//		while(i<j) {
//			if(a[i]!=a[j] ) return false;
//			i++;
//			j--;
//		}
//		return true;
		
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)!= s.charAt(s.length()-1-i)) return false;
		}
		return true;
	}

}
