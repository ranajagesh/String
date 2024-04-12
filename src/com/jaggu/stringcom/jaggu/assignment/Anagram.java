package com.jaggu.stringcom.jaggu.assignment;

public class Anagram {

	public static void main(String[] args) {
		String s = "keep";
		String s1 = "peek";
		
		if(isAnagram(s, s1)) {
			System.out.println("String "+s+" is Anagram");
		}
		else System.out.println("String "+s+" is not Anagram");
	}
	
	public static boolean isAnagram(String s,String s2) {
		
		while(true) {
			if(s.length()!=s2.length()) {
				return false;
			} else if(s.length()==0 && s2.length()==0) {
				return true;
			}
			char ch  = s.charAt(0);
			s = s.replace(ch+"", "");
			s2 = s2.replace(ch+"", "");
			
		}
	}

}
