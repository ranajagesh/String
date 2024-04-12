package com.ramana.stringquestions;

public class Q3CountWords {

	public static void main(String[] args) {
		String s = "Sayan is a good and also boy";
		int count  =1;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(s.charAt(i)==' ') count++;
			
		} 
		System.out.println(count);
	}

}
