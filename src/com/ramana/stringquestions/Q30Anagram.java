package com.ramana.stringquestions;

public class Q30Anagram {

	public static void main(String[] args) {
		String s = "peek";
		String s1 = "keep";
		if(anagra(s,s1)) System.out.println("Anagram");
		else System.out.println("Not Anagram");
		
		
	}
	public static boolean anagra(String s,String s2) {
		while(true) {
			if(s.length()!=s2.length()) return false;
			else if(s2.length()==0 && s.length()==0) return true;
			
			char ch = s.charAt(0);
			s = s.replace(ch+"", "");
			s2 = s2.replace(ch+"", "");
		}
	}
	
	
	

}
