package com.jaggu.string;

public class Palindrome {

	public static void main(String[] args) {
		String s = "malayalam";
		
		if(isPalind(s)) { 
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
	
	static boolean isPalind(String s1) {
		char[] a = s1.toCharArray();
		
		int i = 0,j = a.length-1;
		while(i<j) {
			if(a[i] != a[j]) return false;
			
			i++;
			j--;
		}
		return true;		
		
	}

}
